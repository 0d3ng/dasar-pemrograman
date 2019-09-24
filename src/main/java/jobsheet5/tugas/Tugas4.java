package jobsheet5.tugas;

import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gaji pokok    : ");
        double gajiPokok = scanner.nextDouble();
        System.out.print("Uang makan    : ");
        double uangMakan = scanner.nextDouble();
        System.out.print("Uang transport: ");
        double uangTransport = scanner.nextDouble();

        double total = gajiPokok + uangMakan + uangTransport;
        System.out.println("Gaji sebelum pajak : " + total);
        double pajak = total >= 1000000 ? (0.1 * total) : 0;
        System.out.println("Pajak   :" + pajak);
        System.out.println("Gaji setelah pajak : " + (total - pajak));
    }
}
