import java.util.Scanner;
public class Kafe24 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi;
        int jmlTeh;
        int jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        double totalHarga, nominalBayar;
        float diskon = 10 / 100f;

        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        nominalBayar = totalHarga - (diskon * totalHarga);

        int nominalInt = (int) nominalBayar;

        if (keanggotaan) {
            nominalBayar = totalHarga - (diskon * totalHarga);
        } else {
            nominalBayar = totalHarga;
        }
        

        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh + " Teh, " + jmlRoti + " Roti");
        System.out.println("Nominal bayar Rp " + nominalBayar);
        System.out.println("Nominal bayar (int): Rp " + nominalInt);
    }
}