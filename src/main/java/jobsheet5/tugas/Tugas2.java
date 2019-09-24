package jobsheet5.tugas;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan umur: ");
        int umur = scanner.nextInt();
        String message = umur >= 17 ? "Boleh berkendara" : "Tidak boleh berkendara";
        System.out.println(message);
    }
}
