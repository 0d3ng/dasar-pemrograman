package kuis.preuts;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        final int tarif = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println(String.format(" %s Menghitung lama dan biaya %s", '\u2735', '\u2735'));
        System.out.print("Tono mulai jam    :");
        int tonoJam = scanner.nextInt();
        System.out.print("Tono mulai menit  :");
        int tonoMnt = scanner.nextInt();
        System.out.print("Tini mulai jam    :");
        int tiniJam = scanner.nextInt();
        System.out.print("Tini mulai menit  :");
        int tiniMnt = scanner.nextInt();
        System.out.print("Selesai jam       :");
        int selesaiJam = scanner.nextInt();
        System.out.print("Selesai menit     :");
        int slsMenit = scanner.nextInt();

        int sisaJamTono = selesaiJam - tonoJam;
        int sisaMenitTono = slsMenit - tonoMnt;
        int sisaJamTini = selesaiJam - tiniJam;
        int sisaMenitTini = slsMenit - tiniMnt;

        System.out.println(String.format("Lama membaca Tono %d jam %d menit", sisaJamTono, sisaMenitTono));
        System.out.println(String.format("Lama membaca Tini %d jam %d menit", sisaJamTini, sisaMenitTini));

        int ongkosTono = (sisaJamTono * 30 * tarif) + (sisaMenitTono / 30 * tarif);
        int ongkosTini = (sisaJamTini * 30 * tarif) + (sisaMenitTini / 30 * tarif);

        System.out.println(String.format("Ongkos bayar Tono Rp.%d", ongkosTono));
        System.out.println(String.format("Ongkos bayar Tini Rp.%d", ongkosTini));
        System.out.println(String.format("Ongkos bayar total Rp.%d", ongkosTini + ongkosTono));
    }
}
