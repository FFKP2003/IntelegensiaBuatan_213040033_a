package id.ac.unpas.ib.bfs;

import id.ac.unpas.ib.Node;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BreadthFirstSearch {// Deklarasi sebuah kelas dengan nama BreadthFirstSearch
    public void search(Node start, Node goal) { /* Deklarasi dari sebuah method yang menerima dua parameter yaitu 'Start' dan 'goal', 
                                                  keduanya adalah objek dari kelas 'Node' */
        Queue<Solusi> queue = new LinkedBlockingQueue<>(); // Deklarasi dan menginisialisasi sebuah queue yang berisi objek dari kelas 'Solusi'
        Solusi solusiStart = new Solusi(); // Membuat objek solusiStart dari kelas 'Solusi'
        solusiStart.setNode(start); // Mengatur node 'start' ke dalam objek 'solusiStart'
        queue.add(solusiStart); // Memasukan 'solusiStart' ke dalam queue
        System.out.println("Mencari solusi dari "+start.getNilai()+" ke "+goal.getNilai()); /* Mencetak pesan yang menunjukan bahwa pencarian 
                                                                                              sedang dilakukan dari node 'start' ke node 'goal' */

        while (!queue.isEmpty()) { // Inisialisasi sebuah pengulangan yang akan berjalan selama queue tidak kosong
            Solusi eval = queue.poll(); // Mengambil dan menghapus element pertama dari queue untuk dievaluasi dan disimpan dalam objek 'eval'
            System.out.println("Evaluasi: "+eval.getNode().getNilai()); // Mencetak nilai node yang dievaluasi saat ini

            if (eval.getNode().equals(goal)) { // Memeriksa apakan node yang dievaluasi saat ini adalah node tujuan 'goal'
                System.out.println("Solusi ditemukan: "); // Jika node evaluasi adalah node tujuan, mencetak pesan bahwa solusi ditemukan
                for(Node node: eval.getNodes()) {// Pengkondisian path solusi
                    System.out.print(node.getNilai()+" -> "); // Mencetak nilai node dalam path solusi
                }
                System.out.println(eval.getNode().getNilai()); // Mencetak nilai node tujuan sebagai bagian dari path solusi
                break; // Mengakhiri pengulangan karena solusi sudah ditemukan
            } else { // Jika Node yang dievaluasi bukan node tujuan
                System.out.println("Suksesor "+eval.getNode().getNilai()); // Mencetak pesan menunjukan node yang dievaluasi adalah suksesor
                for (Node successor: eval.getNode().getTetangga()) { /* Memulai Pengulangan untuk mengiterasi melalui suksesor dari node yang 
                                                                        dievaluasi */
                    System.out.print(successor.getNilai()+" "); // Mencetak nilai Suksessor
                    Solusi solusiSuksesor = new Solusi(); // Membuat objek 'solusiSusksesor' untuk suksesor yang dievaluasi
                    solusiSuksesor.setNode(successor); // Mengatur suksesor sebagai node dalam 'solusiSuksesor'
                    solusiSuksesor.setNodes(eval.getNodes()); // Mengatur path node dari evaluasi sebelumnya ke 'solusiSuksesor'
                    solusiSuksesor.getNodes().add(eval.getNode()); // Menambahkan Node evaluasi saat ini ke path 'solusiSuksesor'

                    queue.offer(solusiSuksesor); // Menambahkan 'solusiSuksesor' ke dalam queue untuk evaluasi lebih lanjut
                }
                System.out.println(); // Mencetak baris kosong untuk memisahkan antara evaluasi node yang berbeda dalam tingkat yang sama
                System.out.println(); // Mencetak baris kosong lagi untuk memisahkan antara tingkat yang berbeda dalam pohon pencarian
            }
        }

    }
}
