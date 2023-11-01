package id.ac.unpas.ib.latihan.searching;

public class MainTest {
    public static void main(String[] args) {
        // Membuat Node kota yang diperlukan
        Node Cilegon = new Node("Cilegon");
        Node Serang = new Node("Serang");
        Node Tanggerang = new Node("Tanggerang");
        Node Jakarta = new Node("Jakarta");
        Node Bandung = new Node("Bandung");
        Node Surabaya = new Node("Surabaya");
        Node Malang = new Node("Malang");
        Node Padang = new Node("Padang");
        Node Pekanbaru = new Node("Pekanbaru");
        Node Jambi = new Node("Jambi");
        Node Medan = new Node("Medan");
        Node Kalimantan = new Node("Kalimantan");
        Node Bali = new Node("Bali");

        // Menambah tetangga ke tiap-tiap kota
        // Contoh
        // Cilegon.addTetangga(Bali, false) artinya dari Cilegon tidak ada jalur masuk ke
        // Bali
        Cilegon.addTetangga(Bali, false);
        Cilegon.addTetangga(Medan, false);
        Cilegon.addTetangga(Kalimantan, true);

        Serang.addTetangga(Bandung, true);
        Serang.addTetangga(Pekanbaru, false);

        Tanggerang.addTetangga(Jakarta, false);
        Tanggerang.addTetangga(Jambi, true);
        Tanggerang.addTetangga(Pekanbaru, true);

        Jakarta.addTetangga(Malang, false);
        Jakarta.addTetangga(Tanggerang, true);

        Bandung.addTetangga(Medan, true);
        Bandung.addTetangga(Serang, false);

        Surabaya.addTetangga(Kalimantan, false);
        Surabaya.addTetangga(Malang, true);

        Malang.addTetangga(Surabaya, false);
        Malang.addTetangga(Jakarta, true);

        Padang.addTetangga(Bali, true);
        Padang.addTetangga(Medan, false);

        Pekanbaru.addTetangga(Jambi, false);
        Pekanbaru.addTetangga(Tanggerang, false);
        Pekanbaru.addTetangga(Serang, true);

        Jambi.addTetangga(Medan, false);
        Jambi.addTetangga(Tanggerang, false);
        Jambi.addTetangga(Pekanbaru, true);

        Medan.addTetangga(Cilegon, false);
        Medan.addTetangga(Padang, true);
        Medan.addTetangga(Bandung, false);
        Medan.addTetangga(Jambi, false);

        Kalimantan.addTetangga(Cilegon, false);
        Kalimantan.addTetangga(Surabaya, true);

        Bali.addTetangga(Cilegon, true);
        Bali.addTetangga(Padang, false);

        // Instansiasi DLS
        System.out.println("Depth Limited Search");
        DepthLimitedSearch dls = new DepthLimitedSearch();
        // Mengatur limit depth sebanyak 10
        dls.setLimit(10);
        // Cari jalur dari Cilegon ke Serang
        dls.search(Cilegon, Serang);

        System.out.println();

        // Mengatur limit depth sebanyak 10
        dls.setLimit(10);
        // Cari jalur dari Serang ke Cilegon
        dls.search(Serang, Cilegon);
    }
}
