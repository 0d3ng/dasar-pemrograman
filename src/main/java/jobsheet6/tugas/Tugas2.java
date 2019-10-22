package jobsheet6.tugas;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        String username, password;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan username    :");
        username = scanner.nextLine();
        if (username.equalsIgnoreCase("Mahasiswa")) {
            System.out.print("Masukan password    :");
            password = scanner.nextLine();
            if (password.equals("RaHaSia")) {
                System.out.println("Anda berhasil login");
            } else
                System.out.println("Password Anda salah");
        } else
            System.out.println("Username tidak ditemukan");

    }
}
