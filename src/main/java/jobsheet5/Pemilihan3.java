package jobsheet5;

import java.util.Scanner;

public class Pemilihan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan umur: ");
        int umur = scanner.nextInt();
        if (umur > 60) {
            System.out.println("Lansia");
        } else if (umur > 45) {
            System.out.println("Tua");
        } else if (umur > 17) {
            System.out.println("Dewasa");
        } else if (umur > 5) {
            System.out.println("Anak-anak");
        } else {
            System.out.println("Balita");
        }
    }
}
