public class Barang {
    // Kelas induk
    private String kodeBarang;
    private String namaBarang;
    private double hargaBarang;

    // Constructor
    public Barang(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    // Getter dan Setter
    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(double hargaBarang) {
        if (hargaBarang > 0) {
            this.hargaBarang = hargaBarang;
        } else {
            throw new IllegalArgumentException("Harga barang harus lebih besar dari 0.");
        }
    }
}
