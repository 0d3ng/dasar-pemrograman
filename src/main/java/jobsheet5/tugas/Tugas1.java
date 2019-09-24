package jobsheet5.tugas;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nilai pertama: ");
        int nilaiA = scanner.nextInt();
        System.out.print("Masukan nilai kedua: ");
        int nilaiB = scanner.nextInt();
        int temp = nilaiA > nilaiB ? nilaiA : nilaiB;
        System.out.println("Nilai terbesar  " + temp);
    }
}
