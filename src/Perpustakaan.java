import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {

    String nama;
    String lokasi;
    ArrayList<Buku> listBuku;
    int jmlHariOpreasional;

    Perpustakaan() {
//        ini constructor, ini bisa buat nambah default value
        System.out.println("Test");
        listBuku = new ArrayList<Buku>();
        jmlHariOpreasional = 6; // ex default value
    }

    Perpustakaan(String nama, String lokasi, int jmlHariOpreasional) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.jmlHariOpreasional = jmlHariOpreasional;
        listBuku = new ArrayList<Buku>();
    }

    void printSemuaBuku() {
        for (Buku buku : this.listBuku) {
            System.out.println(buku.judul);
        }
    }

    int jmlhHariLibur() {
        int totalHari = 7;
        int hariLibur = totalHari -jmlHariOpreasional;

        return hariLibur;
    }

    void tambahBuku(List<Buku> bukuBaru) {
        for (Buku b : bukuBaru) {
            this.listBuku.add(b);
        }
    }
}


