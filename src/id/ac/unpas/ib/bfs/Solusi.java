package id.ac.unpas.ib.bfs;

import id.ac.unpas.ib.Node;

import java.util.ArrayList;
import java.util.List;

public class Solusi { // Deklarasi sebuah kelas dengan nama 'Solusi'
    private List<Node> nodes; // Deklarasi variable instance 'nodes' yang merupakan sebuah List dari objek 'Node
    private Node node; // Deklarasi variable instance 'node'

    public Solusi() { // Konstruktor kelas 'Solusi' yang akan dipanggil ketika objek 'Solusi' baru dibuat
        nodes = new ArrayList<>(); // Sebuah objek ArrayList yang kosong dibuyat dan di assign ke variable 'nodes'
    }

    public void setNode(Node node) { // Method yang digunakan untuk mengatur node terkini dalam objek 'Solusi'
        this.node = node; // Metode yang mengatur variable 'node' objek 'Solusi' dengan node yang diberikan sebagai argumen
    }

    public Node getNode() { // Metode yang digunakan untuk mendapatkan node terkini dari objek 'Solusi'
        return node; // Mengembalikan node terkini yang disimpan dalam variable 'node'
    }

    public void setNodes(List<Node> nodes) { // Metode yang digunakan untuk mengatur daftar node(path) dalam objek 'Solusi'
        this.nodes = new ArrayList<>(nodes); // Metode yang digunakan untuk mengatur daftar node(path) dalam objek 'Solusi'
    }

    public List<Node> getNodes() { // Metode yang digunakan untuk mendapatkan daftar node yang membentuk path solusi dalam objek 'Solusi'
        return nodes;//Metode yang digunakan untuk mendapatkan daftar node yang membentuk path solusi dalam objek 'Solusi'
    }
}
