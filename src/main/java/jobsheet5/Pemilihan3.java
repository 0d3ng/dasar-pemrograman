package jobsheet5;

import java.util.Scanner;

public class Pemilihan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan total belanja anda: ");
        int bayar = scanner.nextInt();

        if (bayar >= 2000000) {
            System.out.println("Selamat anda mendapatkan hadiah kompor gas");
        } else if (bayar >= 1000000) {
            System.out.println("Selamat anda mendapatkan hadiah teflon");
        } else if (bayar >= 500000) {
            System.out.println("Selamat anda mendapatkan hadiah piring");
        } else {
            System.out.println("Maaf anda belum beruntung, tingkat belanja anda");
        }
    }
}
