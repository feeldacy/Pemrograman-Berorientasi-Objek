public class lat4s1 {
    public static void main(String[] argr) {
        Barang produk1 = new Barang("Beras", 50000, 1);
        Barang produk2 = new Barang("Sabun", 10000, 2);
        Barang produk3 = new Barang("Sampo", 5000, 2);
        Barang produk4 = new Barang("Gula", 15000, 3);

        Keranjang keranjang1 = new Keranjang();
        keranjang1.tambahBarang(produk1);
        keranjang1.tambahBarang(produk2);
        keranjang1.tambahBarang(produk3);
        keranjang1.tambahBarang(produk4);

        System.out.println("\n====================\n");

        keranjang1.detailKeranjang();
    }
}
