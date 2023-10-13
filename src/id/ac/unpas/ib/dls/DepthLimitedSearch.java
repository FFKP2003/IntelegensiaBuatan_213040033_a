package id.ac.unpas.ib.dls;

import id.ac.unpas.ib.Node;

public class DepthLimitedSearch { // Deklarasi sebuah kelas dengan nama DepthLimitedSearch
    private int limit; // Deklarasi variable instance 'limit'

    public void setLimit(int limit) { // Method yang digunakan untuk mengatur nilai batasan kedalaman 'limit'
        this.limit = limit; // Metode yang mengatur variable 'limit' dengan nilai yang diberikan sebagai argumen
    }

    public int getLimit() { // Metode yang digunakan untuk mendapatkan nilai batasan kedalaman 'limit'
        return limit; // Metode yang mengembalikan nilai variable 'limit
    }

    public void search(Node start, Node goal) { // Method yang digunakan untuk melakukan pencarian DLS dari node 'start' ke node 'goal'
        System.out.println("Mencari solusi dari "+start.getNilai()+" ke "+goal.getNilai()); /* Mencetak pesan yang menunjukan bahwa pencarian 
                                                                                               sedang dilakukan dari node 'start' ke node 'goal'*/

        Node eval = start; // Menginisialisasi node 'eval' dengan node awal 'start'
        for (int i = 0; i < limit; i++) { // Inisialisasi pengulangan for yang akan berjalan sebanyak 'limit' kali
            System.out.println("Level "+i+" evaluasi: "+eval.getNilai()); /* Mencetak pesan yang menunjukan tingkat(level) evaluasi saat ini dan 
                                                                             nilai node yang dievaluasi*/
            if (eval.equals(goal)) { // Memeriksa apakah node yang dievaluasi saat ini sama dengan node tujuan 'goal'
                System.out.println("Solusi ditemukan "); // Jika node evaluasi adalah node tujuan, mencetak pesan bahwa solusi ditemukan
                break;
            }
            if (!eval.getTetangga().isEmpty()) { // Memeriksa pakah node evaluasi memiliki tetangga(suksesor)
                eval = eval.getTetangga().get(0); /* Jika memiliki tetangga, maka node evaluasi diubah menjadi tetangga pertama 
                                                     (kedalaman tingkatnya)*/
            } else { // Jika node evaluasi tidak memiliki tetangga(suksesor)
                break;
            }
        }
    }
}
