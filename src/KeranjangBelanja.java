import java.util.ArrayList;

public class KeranjangBelanja {

    ArrayList<DaftarBarang> keranjang;
    int totalBarang = 0;


    KeranjangBelanja() {
        this.keranjang = new ArrayList<>();
    }

    void tambahBarang(DaftarBarang produk) {

        if (totalBarang + produk.getJumlahBarang() <=5) {
            keranjang.add(produk);
            totalBarang += produk.getJumlahBarang();
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
            System.out.printf("# %s, jumlah: %d%n", produk.getNamaBarang(), produk.getJumlahBarang());
            totalHarga += (produk.getHargaBarang() * produk.getJumlahBarang());
        }

        System.out.printf("Total harga yang harus di bayar: %d", totalHarga);
    }
}
