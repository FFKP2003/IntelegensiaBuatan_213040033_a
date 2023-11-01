package id.ac.unpas.ib.latihan.heuristik.astar;

// main program
public class MainTest {
    // fungsi main
    public static void main(String[] args) {
        // inisialisasi node-node yang ada
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

        // inisialisasi node-node yang ada dengan costnya
        NodeUCS CilegonUCS = new NodeUCS(Cilegon, 366);
        NodeUCS SerangUCS = new NodeUCS(Serang, 0);
        NodeUCS TanggerangUCS = new NodeUCS(Tanggerang, 160);
        NodeUCS JakartaUCS = new NodeUCS(Jakarta, 242);
        NodeUCS BekasiUCS = new NodeUCS(Bekasi, 161);
        NodeUCS BandungUCS = new NodeUCS(Bandung, 176);
        NodeUCS CirebonUCS = new NodeUCS(Cirebon, 77);
        NodeUCS IndramayuUCS = new NodeUCS(Indramayu, 151);
        NodeUCS SemarangUCS = new NodeUCS(Semarang, 226);
        NodeUCS SurabayaUCS = new NodeUCS(Surabaya, 244);
        NodeUCS MalangUCS = new NodeUCS(Malang, 241);
        NodeUCS PalembangUCS = new NodeUCS(Palembang, 234);
        NodeUCS PadangUCS = new NodeUCS(Padang, 380);
        NodeUCS PekanbaruUCS = new NodeUCS(Pekanbaru, 10);
        NodeUCS JambiUCS = new NodeUCS(Jambi, 193);
        NodeUCS MedanUCS = new NodeUCS(Medan, 253);
        NodeUCS KalimantanUCS = new NodeUCS(Kalimantan, 329);
        NodeUCS BatamUCS = new NodeUCS(Batam, 80);
        NodeUCS BengkuluUCS = new NodeUCS(Bengkulu, 199);
        NodeUCS BaliUCS = new NodeUCS(Bali, 374);

        // menambahkan tetangga dari masing-masing node dengan costnya
        CilegonUCS.addTetangga(BaliUCS, 75);
        CilegonUCS.addTetangga(MedanUCS, 140);
        CilegonUCS.addTetangga(KalimantanUCS, 118);

        SerangUCS.addTetangga(BandungUCS, 211);
        SerangUCS.addTetangga(PekanbaruUCS, 101);
        SerangUCS.addTetangga(CirebonUCS, 90);
        SerangUCS.addTetangga(BatamUCS, 85);

        TanggerangUCS.addTetangga(JakartaUCS, 120);
        TanggerangUCS.addTetangga(JambiUCS, 146);
        TanggerangUCS.addTetangga(PekanbaruUCS, 138);

        JakartaUCS.addTetangga(MalangUCS, 75);
        JakartaUCS.addTetangga(TanggerangUCS, 120);

        BekasiUCS.addTetangga(IndramayuUCS, 86);

        BandungUCS.addTetangga(MedanUCS, 99);
        BandungUCS.addTetangga(SerangUCS, 211);

        CirebonUCS.addTetangga(SerangUCS, 90);

        IndramayuUCS.addTetangga(BatamUCS, 98);
        IndramayuUCS.addTetangga(BekasiUCS, 86);

        SemarangUCS.addTetangga(PalembangUCS, 87);
        SemarangUCS.addTetangga(BengkuluUCS, 92);

        SurabayaUCS.addTetangga(KalimantanUCS, 111);
        SurabayaUCS.addTetangga(MalangUCS, 70);

        MalangUCS.addTetangga(SurabayaUCS, 70);
        MalangUCS.addTetangga(JakartaUCS, 75);

        PalembangUCS.addTetangga(SemarangUCS, 87);

        PadangUCS.addTetangga(BaliUCS, 71);
        PadangUCS.addTetangga(MedanUCS, 151);

        PekanbaruUCS.addTetangga(JambiUCS, 97);
        PekanbaruUCS.addTetangga(TanggerangUCS, 138);
        PekanbaruUCS.addTetangga(SerangUCS, 101);

        JambiUCS.addTetangga(MedanUCS, 80);
        JambiUCS.addTetangga(TanggerangUCS, 146);
        JambiUCS.addTetangga(PekanbaruUCS, 97);

        MedanUCS.addTetangga(CilegonUCS, 140);
        MedanUCS.addTetangga(PadangUCS, 151);
        MedanUCS.addTetangga(BandungUCS, 99);
        MedanUCS.addTetangga(JambiUCS, 80);

        KalimantanUCS.addTetangga(CilegonUCS, 118);
        KalimantanUCS.addTetangga(SurabayaUCS, 111);

        BatamUCS.addTetangga(SerangUCS, 85);
        BatamUCS.addTetangga(BengkuluUCS, 142);
        BatamUCS.addTetangga(BaliUCS, 98);

        BengkuluUCS.addTetangga(SemarangUCS, 92);
        BengkuluUCS.addTetangga(BatamUCS, 142);

        BaliUCS.addTetangga(CilegonUCS, 75);
        BaliUCS.addTetangga(PadangUCS, 71);

        // menampilkan hasil dari algoritma A*
        System.out.println("A*");
        // inisialisasi objek AStar
        AStar aStar = new AStar();
        // memanggil fungsi search dari objek aStar dari node CilegonUCS ke SerangUCS
        aStar.search(CilegonUCS, SerangUCS);
        System.out.println();
    }
}
