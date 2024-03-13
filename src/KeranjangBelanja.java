import java.util.ArrayList;

public class KeranjangBelanja {

    ArrayList<DaftarBarang> keranjang;
    int totalBarang = 0;


    KeranjangBelanja() {
        this.keranjang = new ArrayList<>();
    }

    void tambahBarang(DaftarBarang produk) {

        if (totalBarang + produk.jumlahBarang <=5) {
            keranjang.add(produk);
            totalBarang += produk.jumlahBarang;
            System.out.println("Berhasil memasukkan ke keranjang");
        } else {
            System.out.println("Wes to, Keranjang e we mbludag!!");
        }
    }

    void detailKeranjang() {

        int totalHarga = 0;
        System.out.println("Jumlah Barang Di Keranjang Saat Ini: " + totalBarang);
        System.out.println("Barang pada keranjang:");

        for (DaftarBarang produk : keranjang) {
            System.out.printf("# %s, jumlah: %d%n", produk.namaBarang, produk.jumlahBarang);
            totalHarga += (produk.hargaBarang * produk.jumlahBarang);
        }

        System.out.printf("Total harga yang harus di bayar: %d", totalHarga);
    }
}
