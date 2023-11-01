package id.ac.unpas.ib.latihan.heuristik.greedybfs;

// Main program
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

        // menambahkan tetangga dari masing-masing node
        CilegonUCS.addTetangga(BaliUCS);
        CilegonUCS.addTetangga(MedanUCS);
        CilegonUCS.addTetangga(KalimantanUCS);

        SerangUCS.addTetangga(BandungUCS);
        SerangUCS.addTetangga(PekanbaruUCS);
        SerangUCS.addTetangga(CirebonUCS);
        SerangUCS.addTetangga(BatamUCS);

        TanggerangUCS.addTetangga(JakartaUCS);
        TanggerangUCS.addTetangga(JambiUCS);
        TanggerangUCS.addTetangga(PekanbaruUCS);

        JakartaUCS.addTetangga(MalangUCS);
        JakartaUCS.addTetangga(TanggerangUCS);

        BekasiUCS.addTetangga(IndramayuUCS);

        BandungUCS.addTetangga(MedanUCS);
        BandungUCS.addTetangga(SerangUCS);

        CirebonUCS.addTetangga(SerangUCS);

        IndramayuUCS.addTetangga(BatamUCS);
        IndramayuUCS.addTetangga(BekasiUCS);

        SemarangUCS.addTetangga(PalembangUCS);
        SemarangUCS.addTetangga(BengkuluUCS);

        SurabayaUCS.addTetangga(KalimantanUCS);
        SurabayaUCS.addTetangga(MalangUCS);

        MalangUCS.addTetangga(SurabayaUCS);
        MalangUCS.addTetangga(JakartaUCS);

        PalembangUCS.addTetangga(SemarangUCS);

        PadangUCS.addTetangga(BaliUCS);
        PadangUCS.addTetangga(MedanUCS);

        PekanbaruUCS.addTetangga(JambiUCS);
        PekanbaruUCS.addTetangga(TanggerangUCS);
        PekanbaruUCS.addTetangga(SerangUCS);

        JambiUCS.addTetangga(MedanUCS);
        JambiUCS.addTetangga(TanggerangUCS);
        JambiUCS.addTetangga(PekanbaruUCS);

        MedanUCS.addTetangga(CilegonUCS);
        MedanUCS.addTetangga(PadangUCS);
        MedanUCS.addTetangga(BandungUCS);
        MedanUCS.addTetangga(JambiUCS);

        KalimantanUCS.addTetangga(CilegonUCS);
        KalimantanUCS.addTetangga(SurabayaUCS);

        BatamUCS.addTetangga(SerangUCS);
        BatamUCS.addTetangga(BengkuluUCS);
        BatamUCS.addTetangga(IndramayuUCS);

        BengkuluUCS.addTetangga(SemarangUCS);
        BengkuluUCS.addTetangga(BatamUCS);

        BaliUCS.addTetangga(CilegonUCS);
        BaliUCS.addTetangga(PadangUCS);

        // menampilkan hasil dari algoritma Greedy Best First Search
        System.out.println("Greedy BFS");
        // inisialisasi objek GreedyBestFirstSearch
        GreedyBestFirstSearch bfs = new GreedyBestFirstSearch();
        // memanggil fungsi search dari objek GreedyBestFirstSearch dari node CilegonUCS ke
        // SerangUCS
        bfs.search(CilegonUCS, SerangUCS);
        System.out.println();
    }
}
