package id.ac.unpas.ib.ucs;

import id.ac.unpas.ib.Node;

import java.util.ArrayList;
import java.util.List;

public class NodeUCS { // Deklarasi sebuah kelas dengan nama NodeUCS
    private String nilai; // Deklarasi variable instance 'nilai'

    private int cost; // Deklarasi variable instance 'cost'

    private List<NodeUCS> tetangga; /* Deklarasi variable instance 'tetangga', 
                                      digunakan untuk menyimpan daftar node tetangga dari node ini. 
                                      Variable ini diinisialisasi sebagai ArrayList kosong */

    public NodeUCS(Node node, int cost) { /* Konstruktor kelas 'NodeUCS' yang menerima dua argumen objek 'node' dan 
                                             sebuah nilai cost */
        this.nilai = node.getNilai(); /* nilai dari node 'Node' digunakan untuk menginisialisasi variable 
                                        'nilai' dalam objek 'NodeUCS' */
        this.cost = cost; // Menginisialisasi variable 'cost' dalam objek 'NodeUCS'
        tetangga = new ArrayList<>(); /* ArrayList kosong yang digunakan untuk menginisialisasi variable 
                                        'tetangga' */
    }

    public String getNilai() { // Metode yang digunakan untuk mendapatkan nilai dari node
        return nilai;
    }

    public void setNilai(String nilai) { // Metode yang digunakan untuk mengatur nilai dari node.
        this.nilai = nilai; /* Metode ini mengatur variabel' nilai' dengan nilai yang diberikan 
                               sebagai argumen */
    }

    public void setCost(int cost) { // Metode yang digunakan untuk mengatur biaya (cost) dari node
        this.cost = cost; /* Metode ini mengatur variabel 'cost' dengan nilai cost yang 
                             diberikan sebagai argumen */
    }

    public int getCost() { // Metode yang digunakan untuk mendapatkan biaya (cost) dari node
        return cost;
    }

    public void setTetangga(List<NodeUCS> tetangga) { /* Metode yang digunakan untuk mengatur daftar tetangga (successor) dari 
                                                         node */
        this.tetangga = tetangga; /* Metode ini mengatur variabel 'tetangga' dengan daftar tetangga yang 
                                     diberikan sebagai argumen */
    }

    public List<NodeUCS> getTetangga() { /* Metode yang digunakan untuk mendapatkan daftar tetangga (successor) dari 
                                            node */
        return tetangga;
    }

    public void addTetangga(NodeUCS node) { /* Metode yang digunakan untuk menambahkan node sebagai tetangga (successor) 
                                               dari node ini */
        tetangga.add(node); /* Metode ini menambahkan node yang diberikan sebagai argumen ke dalam 
                               daftar tetangga node ini */
    }

    @Override 
    public boolean equals(Object obj) { /* metode override dari metode 'equals' yang ada di kelas Object. Metode 
                                           ini membandingkan dua objek "NodeUCS" berdasarkan nilai (nilai atribut) */
        if (obj instanceof NodeUCS) { /* memeriksa apakah objek yang dibandingkan adalah instance dari kelas 
                                        "NodeUCS" */
            return ((NodeUCS) obj).nilai.equals(this.nilai); /* Jika objek adalah instance dari "NodeUCS," maka metode ini 
                                                                membandingkan nilai (atribut 'nilai') dari dua objek "NodeUCS" dan 
                                                                mengembalikan 'true' jika nilai tersebut sama */
        }
        return false; /* Jika objek yang dibandingkan bukan instance dari "NodeUCS" atau 
                         nilai-nilai tidak sama, metode ini mengembalikan 'false */
    }
}
