public class lat5 {
    public static void main(String[] args) {

        DaftarBarang produk1 = new DaftarBarang();
        produk1.setNamaBarang("Beras");
        produk1.setHargaBarang(50000);
        produk1.setJumlahBarang(1);

        DaftarBarang produk2 = new DaftarBarang();
        produk2.setNamaBarang("Sabun");
        produk2.setHargaBarang(10000);
        produk2.setJumlahBarang(2);

        DaftarBarang produk3 = new DaftarBarang();
        produk3.setNamaBarang("Sampo");
        produk3.setHargaBarang(5000);
        produk3.setJumlahBarang(2);

        DaftarBarang produk4 = new DaftarBarang();
        produk4.setNamaBarang("Gula");
        produk4.setHargaBarang(15000);
        produk4.setJumlahBarang(3);

        KeranjangBelanja keranjang1 = new KeranjangBelanja();
        keranjang1.tambahBarang(produk1);
        keranjang1.tambahBarang(produk2);
        keranjang1.tambahBarang(produk3);
        keranjang1.tambahBarang(produk4);
//

//        System.out.println(produk1.getNamaBarang());
        System.out.println("\n====================\n");

        keranjang1.detailKeranjang();
    }
}
