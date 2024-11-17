import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramTransaksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input data
            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();

            System.out.print("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Masukkan Harga Barang: ");
            double hargaBarang = scanner.nextDouble();

            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();

            // Validasi input
            if (hargaBarang <= 0 || jumlahBeli <= 0) {
                throw new IllegalArgumentException("Harga dan jumlah beli harus lebih besar dari 0.");
            }

            // Membuat objek transaksi
            Transaksi transaksi = new Transaksi(noFaktur, kodeBarang, namaBarang, hargaBarang, jumlahBeli);

            // Tampilkan detail transaksi
            System.out.println("\n=== Detail Transaksi ===");
            transaksi.tampilkanDetail();

        } catch (InputMismatchException e) {
            System.out.println("Error: Input tidak valid. Harap masukkan angka untuk harga dan jumlah beli.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Terjadi kesalahan tidak terduga. Silakan coba lagi.");
        } finally {
            scanner.close();
        }
    }
}
