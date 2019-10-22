package jobsheet6.tugas;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        int sisiA, sisiB, sisiC;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan sisi A: ");
        sisiA = scanner.nextInt();
        System.out.print("Masukan sisi B: ");
        sisiB = scanner.nextInt();
        System.out.print("Masukan sisi C: ");
        sisiC = scanner.nextInt();
        if (sisiA == sisiB && sisiB == sisiC && sisiC == sisiA)
            System.out.println("Segitiga sama sisi");
        else if (sisiA == sisiB || sisiB == sisiC || sisiC == sisiA)
            System.out.println("Segitiga sama kaki");
        else
            System.out.println("Segitiga sembarang");
    }
}
