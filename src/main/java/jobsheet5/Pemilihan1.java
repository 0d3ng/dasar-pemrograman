package jobsheet5;

import java.util.Scanner;

public class Pemilihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan angka:  ");
        int angka = scanner.nextInt();
//        if (angka % 2 == 0)
//            System.out.println("Bilangan genap");
//        else
//            System.out.println("Bilangan ganjil");

        // TODO: 24/09/19 using ternary operator
        String output = angka % 2 == 0 ? "Bilangan genap" : "Bilangan ganjil";
        System.out.println(output);
    }
}
