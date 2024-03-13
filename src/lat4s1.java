public class lat4s1 {
    public static void main(String[] args) {

        DaftarBarang produk1 = new DaftarBarang("Beras", 50000, 1);
        DaftarBarang produk2 = new DaftarBarang("Sabun", 10000, 2);
        DaftarBarang produk3 = new DaftarBarang("Sampo", 5000, 2);
        DaftarBarang produk4 = new DaftarBarang("Gula", 15000, 3);

        KeranjangBelanja keranjang1 = new KeranjangBelanja();
        keranjang1.tambahBarang(produk1);
        keranjang1.tambahBarang(produk2);
        keranjang1.tambahBarang(produk3);
        keranjang1.tambahBarang(produk4);

        System.out.println("\n====================\n");

        keranjang1.detailKeranjang();
    }
}
