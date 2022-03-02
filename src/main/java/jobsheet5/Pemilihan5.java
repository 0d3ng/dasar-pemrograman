package jobsheet5;

import java.util.Scanner;

public class Pemilihan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        int angka = scanner.nextInt();
        String hasil = angka > 0 ? "Bilangan positif" : "Bilangan negatif";
        System.out.println(angka + " adalah " + hasil);
    }
}
