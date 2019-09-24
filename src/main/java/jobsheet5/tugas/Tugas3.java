package jobsheet5.tugas;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nilai uas     : ");
        float uas = scanner.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = scanner.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = scanner.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = scanner.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai total = " + total + " sehingga " + message);
    }
}
