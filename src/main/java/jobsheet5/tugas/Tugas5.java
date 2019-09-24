package jobsheet5.tugas;

import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        double potongan = 0, setelahPotongan, diskon = 0;
        String member = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Total belanja    : ");
        double totalBelanja = scanner.nextDouble();
        if (totalBelanja > 1000000) {
            diskon = 10;
            member = "Platinum";
        } else if (totalBelanja > 500000) {
            diskon = 5;
            member = "Gold";
        } else if (totalBelanja > 200000) {
            diskon = 2;
            member = "Silver";
        }
        potongan = (diskon / 100) * totalBelanja;
        setelahPotongan = totalBelanja - potongan;

        if (!member.equals("")) {
            System.out.println("Anda mendapatkan potongan member " + member + " sebesar " + diskon + "%");
            System.out.println("Total belanja Anda sebesar " + totalBelanja);
            System.out.println("Potongan diskon member adalah " + potongan);
            System.out.println("Total bayar anda adalah " + setelahPotongan);
        } else {
            System.out.println("Total belanja Anda masih kurang untuk mendapatkan diskon member");
            System.out.println("Total belanja Anda sebesar " + totalBelanja);
        }

    }
}
