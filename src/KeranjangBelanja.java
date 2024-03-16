import java.util.ArrayList;

public class KeranjangBelanja {

    int jmlBarang = 0;

    ArrayList<DaftarBarang> listBarang = new ArrayList<>();

    public KeranjangBelanja() {
    }

    void tambahBarang(DaftarBarang barang) {
        if (jmlBarang + barang.getJumlahBarang() <= 5) {
            listBarang.add(barang);
            jmlBarang += barang.getJumlahBarang();
            System.out.println("Berhasil memasukan ke kranjang");
        } else {
            System.out.println("Wes too, Keranjange wes mbludhag!!");
        }

    }

    int totalHarga() {
        int harga = 0;
        for (DaftarBarang barang : listBarang
        ) {
            harga += barang.getHargaBarang() * barang.getJumlahBarang();
        }
        return harga;
    }

    void printHasil() {
        System.out.println("Jumlah Barang Di Keranjang Saat Ini : " + jmlBarang);
        System.out.println("Barang Pada Keranjang: ");
        for (int i = 0; i < listBarang.size(); i++) {
            System.out.println("# " + listBarang.get(i).getNamaBarang() + ", jumlah : " + listBarang.get(i).getJumlahBarang());
        }
        System.out.println("Total Harga Yang Harus di Bayar : " + totalHarga());
    }


}
