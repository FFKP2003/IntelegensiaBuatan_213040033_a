package backtrack;

public class MainTest {
    public static void main(String[] args) {
        Node Cilegon = new Node("Cilegon");
        Node Serang = new Node("Serang");
        Node Tanggerang = new Node("Tanggerang");
        Node Jakarta = new Node("Jakarta");
        Node Bekasi = new Node("Bekasi");
        Node Bandung = new Node("Bandung");
        Node Cirebon = new Node("Cirebon");
        Node Indramayu = new Node("Indramayu");
        Node Semarang = new Node("Semarang");
        Node Surabaya = new Node("Surabaya");
        Node Malang = new Node("Malang");
        Node Palembang = new Node("Palembang");
        Node Padang = new Node("Padang");
        Node Pekanbaru = new Node("Pekanbaru");
        Node Jambi = new Node("Jambi");
        Node Medan = new Node("Medan");
        Node Kalimantan = new Node("Kalimantan");
        Node Batam = new Node("Batam");
        Node Bengkulu = new Node("Bengkulu");
        Node Bali = new Node("Bali");

        Cilegon.addTetangga(Bali);
        Cilegon.addTetangga(Medan);
        Cilegon.addTetangga(Kalimantan);

        Serang.addTetangga(Bandung);
        Serang.addTetangga(Pekanbaru);
        Serang.addTetangga(Cirebon);
        Serang.addTetangga(Batam);

        Tanggerang.addTetangga(Jakarta);
        Tanggerang.addTetangga(Jambi);
        Tanggerang.addTetangga(Pekanbaru);

        Jakarta.addTetangga(Malang);
        Jakarta.addTetangga(Tanggerang);

        Bekasi.addTetangga(Indramayu);

        Bandung.addTetangga(Medan);
        Bandung.addTetangga(Serang);

        Cirebon.addTetangga(Serang);

        Indramayu.addTetangga(Batam);
        Indramayu.addTetangga(Bekasi);

        Semarang.addTetangga(Palembang);
        Semarang.addTetangga(Bengkulu);

        Surabaya.addTetangga(Kalimantan);
        Surabaya.addTetangga(Malang);

        Malang.addTetangga(Surabaya);
        Malang.addTetangga(Jakarta);

        Palembang.addTetangga(Semarang);

        Padang.addTetangga(Bali);
        Padang.addTetangga(Medan);

        Pekanbaru.addTetangga(Jambi);
        Pekanbaru.addTetangga(Tanggerang);
        Pekanbaru.addTetangga(Serang);

        Jambi.addTetangga(Medan);
        Jambi.addTetangga(Tanggerang);
        Jambi.addTetangga(Pekanbaru);

        Medan.addTetangga(Cilegon);
        Medan.addTetangga(Padang);
        Medan.addTetangga(Bandung);
        Medan.addTetangga(Jambi);

        Kalimantan.addTetangga(Cilegon);
        Kalimantan.addTetangga(Surabaya);

        Batam.addTetangga(Serang);
        Batam.addTetangga(Bengkulu);
        Batam.addTetangga(Indramayu);

        Bengkulu.addTetangga(Semarang);
        Bengkulu.addTetangga(Batam);

        Bali.addTetangga(Cilegon);
        Bali.addTetangga(Padang);

        System.out.println("DLS");
        DepthLimitedSearch dls = new DepthLimitedSearch();
        dls.setLimit(10);
        dls.search(Cilegon, Serang);
        System.out.println();
    }
}
