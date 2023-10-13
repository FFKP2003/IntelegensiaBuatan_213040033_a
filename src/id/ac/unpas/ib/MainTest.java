package id.ac.unpas.ib;

import id.ac.unpas.ib.bfs.BreadthFirstSearch;
import id.ac.unpas.ib.dls.DepthLimitedSearch;
import id.ac.unpas.ib.ucs.NodeUCS;
import id.ac.unpas.ib.ucs.UniformCostSearch;

public class MainTest {
    // Main Method
    public static void main(String[] args) {
/* Membuat objek-objek node yang mewakili kota-kota dalam peta indonesia. setiap 
kota memiliki nama dan beberapa diantaranya memiliki tetangga (kota yang 
terhubung)*/

        Node Cilegon = new Node("Cilegon");
        Node Serang = new Node("Serang");
        Node Tanggerang = new Node("Tanggerang");
        Node Jakarta = new Node("Jakarta");
        Node Bekasi = new Node("Bekasi");
        Node Bandung = new Node("Bandung");
        Node Cirebon = new Node("Cirebon");
        Node Indramayu = new Node("Indramayu");
        Node Semarang = new Node("Semarang");
        Node Malang = new Node("Malang");
        Node Surabaya = new Node("Surabaya");
        Node Kalimantan = new Node("Kalimantan");
        Node Padang = new Node("Padang");
        Node Pekanbaru = new Node("Pekanbaru");
        Node Palembang = new Node("Palembang");

        Cilegon.addTetangga(Serang);
        Cilegon.addTetangga(Tanggerang);

        Serang.addTetangga(Cilegon);
        Serang.addTetangga(Tanggerang);

        Tanggerang.addTetangga(Serang);
        Tanggerang.addTetangga(Cilegon);
        Tanggerang.addTetangga(Jakarta);

        Jakarta.addTetangga(Bekasi);
        Jakarta.addTetangga(Bandung);

        Bekasi.addTetangga(Jakarta);
        Bekasi.addTetangga(Bandung);

        Bandung.addTetangga(Jakarta);
        Bandung.addTetangga(Bekasi);

        Cirebon.addTetangga(Indramayu);

        Indramayu.addTetangga(Cirebon);
        Indramayu.addTetangga(Semarang);

        Semarang.addTetangga(Indramayu);
        Semarang.addTetangga(Malang);

        Malang.addTetangga(Semarang);
        Malang.addTetangga(Surabaya);

        Surabaya.addTetangga(Kalimantan);
        Surabaya.addTetangga(Malang);
        Surabaya.addTetangga(Semarang);

        Kalimantan.addTetangga(Surabaya);

        Padang.addTetangga(Pekanbaru);
        Padang.addTetangga(Palembang);
       
        Pekanbaru.addTetangga(Padang);
        Pekanbaru.addTetangga(Palembang);

        Palembang.addTetangga(Padang);
        Palembang.addTetangga(Pekanbaru);

 // Mencari rute dari Cilegon ke Pekanbaru menggunakan BFS
        System.out.println("BFS");
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.search(Cilegon, Pekanbaru);
        System.out.println();

 // Mencari rute dari Cilegon ke Pekanbaru menggunakan DLS
        System.out.println("DLS");
        DepthLimitedSearch dls = new DepthLimitedSearch();
        dls.setLimit(7);
        dls.search(Cilegon, Pekanbaru);
        System.out.println();

 // Membuat objek NodeUCS untuk UCS dengan bobot (jarak dalam kilometer)
        NodeUCS CilegonUCS = new NodeUCS(Cilegon, 366);
        NodeUCS BandungUCS = new NodeUCS(Bandung, 0);
        NodeUCS SemarangUCS = new NodeUCS(Semarang, 160);
        NodeUCS BekasiUCS = new NodeUCS(Bekasi, 242);
        NodeUCS PalembangUCS = new NodeUCS(Palembang, 161);
        NodeUCS PadangUCS = new NodeUCS(Padang, 176);
        NodeUCS PekanbaruUCS = new NodeUCS(Pekanbaru, 77);
        NodeUCS MalangUCS = new NodeUCS(Malang, 151);
        NodeUCS SurabayaUCS = new NodeUCS(Surabaya, 226);
        NodeUCS KalimantanUCS = new NodeUCS(Kalimantan, 244);
        NodeUCS IndramayuUCS = new NodeUCS(Indramayu, 241);
        NodeUCS CirebonUCS = new NodeUCS(Cirebon, 234);
        NodeUCS JakartaUCS = new NodeUCS(Jakarta, 380);
        NodeUCS TanggerangUCS = new NodeUCS(Tanggerang, 10);
        NodeUCS SerangUCS = new NodeUCS(Serang, 193);

// Menambahkan rute antara kota-kota untuk UCS
        SerangUCS.addTetangga(CilegonUCS);
        SerangUCS.addTetangga(TanggerangUCS);

        MalangUCS.addTetangga(SurabayaUCS);
        MalangUCS.addTetangga(PalembangUCS);
        MalangUCS.addTetangga(SurabayaUCS);
        MalangUCS.addTetangga(PadangUCS);

        JakartaUCS.addTetangga(BekasiUCS);
        JakartaUCS.addTetangga(BandungUCS);
        JakartaUCS.addTetangga(CirebonUCS);

        KalimantanUCS.addTetangga(MalangUCS);
        KalimantanUCS.addTetangga(PalembangUCS);

        PekanbaruUCS.addTetangga(PadangUCS);

        IndramayuUCS.addTetangga(CirebonUCS);
        IndramayuUCS.addTetangga(SemarangUCS);

        CirebonUCS.addTetangga(IndramayuUCS);

        CilegonUCS.addTetangga(SerangUCS);
        CilegonUCS.addTetangga(TanggerangUCS);

        BandungUCS.addTetangga(JakartaUCS);
        BandungUCS.addTetangga(BekasiUCS);

        BekasiUCS.addTetangga(JakartaUCS);
        BekasiUCS.addTetangga(BandungUCS);

        SemarangUCS.addTetangga(IndramayuUCS);
        SemarangUCS.addTetangga(SurabayaUCS);

        PalembangUCS.addTetangga(PekanbaruUCS);

        PadangUCS.addTetangga(PekanbaruUCS);
        PadangUCS.addTetangga(PalembangUCS);

        SurabayaUCS.addTetangga(SemarangUCS);
        SurabayaUCS.addTetangga(MalangUCS);
        SurabayaUCS.addTetangga(PalembangUCS);

        TanggerangUCS.addTetangga(SerangUCS);
        TanggerangUCS.addTetangga(CilegonUCS);

/* Mencetak pesan yang menunjukan bahwa pencarian menggunakan algoritma 
'UCS' akan segera dimulai */

        System.out.println("UCS");

        //Membuat objek 'ucs' dari kelas 'UniformCostSearch'
        UniformCostSearch ucs = new UniformCostSearch();
        
/* Memanggil method 'search' dari objek 'UCS' untuk mencari jalur dari 
kota 'Cilegon' dengan biaya 366 ke kota 'Pekanbaru' dengan biaya 77 menggunakan 
UCS */
        ucs.search(CilegonUCS, PekanbaruUCS);
        System.out.println();
    }
}
