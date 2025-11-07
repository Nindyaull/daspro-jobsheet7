import java.util.Scanner;

public class TugasParkir_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi = 0, total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1 mobil, 2 motor, 0 keluar): ");
            jenis = sc.nextInt();
            System.out.print("Masukkan durasi: ");
            durasi = sc.nextInt();

            if (jenis == 1 && jenis == 2) {
                continue;
            }
            if (durasi > 5) {
                total += 12500;
            }
            if (jenis == 1) {
                total += durasi*3000;
            }
            if (jenis == 2) {
                total += durasi*2000;
            }
        } while (jenis!=0);
        System.out.println("Total pembayaran parkir: " + total);
    }
}
