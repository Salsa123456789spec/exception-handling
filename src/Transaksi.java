public class Transaksi extends Barang {
    private String noFaktur;
    private int jumlahBeli;

    public Transaksi(String noFaktur, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang);
        this.noFaktur = noFaktur;
        if (jumlahBeli > 0) {
            this.jumlahBeli = jumlahBeli;
        } else {
            throw new IllegalArgumentException("Jumlah beli harus lebih besar dari 0.");
        }
    }

    public double hitungTotal() {
        return getHargaBarang() * jumlahBeli;
    }

    public void tampilkanDetail() {
        System.out.println("No Faktur    : " + noFaktur);
        System.out.println("Kode Barang  : " + getKodeBarang());
        System.out.println("Nama Barang  : " + getNamaBarang());
        System.out.printf("Harga Barang : Rp %.2f\n", getHargaBarang());
        System.out.println("Jumlah Beli  : " + jumlahBeli);
        System.out.printf("Total Harga  : Rp %.2f\n", hitungTotal());
    }
}
