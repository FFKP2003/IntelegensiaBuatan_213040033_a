package id.ac.unpas.ib.ucs;

import java.util.ArrayList;
import java.util.List;

public class UniformCostSearch { // Deklarasi sebuah kelas dengan nama UniformCostSearch

    public void search(NodeUCS start, NodeUCS goal) { /* Metode 'search' yang digunakan untuk menjalankan algoritma UCS untuk 
                                                         mencari solusi dari node 'start' ke node 'goal'*/
        System.out.println("Mencari solusi dari "+start.getNilai()+" ke "+goal.getNilai()); /* Mencetak pesan yang menunjukan bahwa pencarian solusi sedang 
                                                                                               dilakukan dari node 'start' ke node 'goal' */
        NodeUCS eval = start; /* Menginisialisasi node 'eval' dengan node awal 'start' untuk memulai 
                                 evaluasi */
        boolean done = false; // Menginisialisasi variable 'done' sebagai 'false'
        List<NodeUCS> solusi = new ArrayList<>(); /* Membuat sebuah ArrayList kosong yang digunakan untuk menyimpan ppath 
                                                     atau urutan node yang membentuk solusi */
        while (!done) { // Loop 'while; yang akan berjalan selama variable 'done' masih 'false'
            System.out.println("Evaluasi: "+eval.getNilai()+" dengan cost "+eval.getCost()); /* Mencetak pesan yang menunjukan evaluasi saat ini, mencakup nilai 
                                                                                                node 'getNilai()' dan biaya 'getCost() */
            solusi.add(eval); // Node yang dievaluasi ditambahkan ke daftar solusi
            if (eval.equals(goal)) { /* Memeriksa apakah node yang dievaluasi saat ini adalah node 
                                        tujuan 'goal' */
                System.out.println("Solusi ditemukan "); /* Jika node evaluasi adalah node tujuan, mencetak pesan bahwa 
                                                            solusi ditemukan */
                done = true; /* Mengatur 'done' menjadi 'true' untuk menandai bahwa 
                                pencarian sudah selesai */
            }
            if (!eval.getTetangga().isEmpty()) { // Memeriksa apakah node evaluasi memiliki suksesor
                NodeUCS best = null; // inisialisai node terbaik 'best' sebagai 'null'
                int min = Integer.MAX_VALUE; /* Inisialisasi variable 'min' dengan nilai maksumum bilangan 
                                                bulat yang mungkin */
                System.out.println(); // Mencetak baris kosong untuk memisahkan output
                for (NodeUCS node: eval.getTetangga()) { /* Loop for untuk mengintegrasi melalui suksesor-suksesor node 
                                                            evaluasi */
                    System.out.print(node.getNilai() + " ("+ node.getCost() + "), "); // Mencetak nilai dan biaya dari masing-masing suksesor
                    if (min > node.getCost()) { /* Memeriksa apakah biaya suksesor saat ini lebih kecil 
                                                   dari nilai minimum 'min' */
                        min = node.getCost(); /* Jika ya, maka nilai minimum 'min' diperbarui dengan 
                                                 biaya suksesor saat ini */
                        best = node; /* Node terbaik 'best' diperbarui menjadi node suksesor 
                                        dengan biaya terendah */

                    }
                }
                System.out.println(); // Mencetak baris untuk memisahkan output
                System.out.println("Node terpilih: "+best.getNilai()+" ("+min+")"); /* mencetak pesan yang menunjukan node terpilih (suksesor 
                                                                                       terbaik) beserta biayanya */
                eval = best; /* Node evaluasi saat ini diubah menjadi node terbaik yang 
                                dipilih */
            } else {
                done = true; /* Mengatur 'done' menjadi 'true' untuk menandai bahwa 
                                pencarian sudah selesai */
            }
        }

        System.out.println();
        System.out.println("Solusi ditemukan: ");
        for (NodeUCS node: solusi) { // Loop for untuk mengiterasi melalui semua node dalam daftar solusi
            System.out.println(node.getNilai()+" ("+node.getCost()+")"); // Mencetak nilai dan biaya setiap node dalam path solusi
        }
    }
}
