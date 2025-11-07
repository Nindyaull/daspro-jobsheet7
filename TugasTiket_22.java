import java.util.Scanner;

public class TugasTiket_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiket = 50000, totalTiket = 0, jmlTiket;
        double diskon = 0, totalHarga, PendapatanSehari = 0;

        do {
            System.out.print("Masukkan jumlah tiket: ");
            jmlTiket = sc.nextInt();

            if (jmlTiket == 0) {
                break;
            }

            if (jmlTiket < 0) {
                System.out.println("Jumlah tiket tidak valid (negatif)");
                continue;
            }
            
            totalHarga = jmlTiket * tiket;

            if (jmlTiket > 4 && jmlTiket < 10) {
                diskon = 0.1 * jmlTiket * tiket;
                totalHarga = jmlTiket * tiket - diskon;
            } else if (jmlTiket > 10) {
                diskon = 0.15 * jmlTiket * tiket;
                totalHarga = jmlTiket * tiket - diskon;
            }
            totalTiket += jmlTiket;
            PendapatanSehari += totalHarga;
            System.out.println("Diskon: Rp " + diskon);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            System.out.println("Total pendapatan sehari: Rp " + PendapatanSehari);
            System.out.println("Total penjualan tiket: " + totalTiket);
            System.out.println();
            sc.nextLine();
        } while (true);
    }
}
