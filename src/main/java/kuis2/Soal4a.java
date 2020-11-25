package kuis2;

import java.util.Scanner;

public class Soal4a {
    public static void main(String[] args) {
        int choose = 0;
        int n = 0;
        String[] nama = new String[0];
        String[] nim = new String[0];
        float[] ipk = new float[0];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n***Sistem informasi mahasiswa***");
            System.out.println("0. Input data mahasiswa");
            System.out.println("1. Menampilkan mahasiswa");
            System.out.println("2. Mencari mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 0:
                    System.out.print("Masukan banyaknya data: ");
                    n = scanner.nextInt();
                    nama = new String[n];
                    nim = new String[n];
                    ipk = new float[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Masukan nama: ");
                        nama[i] = scanner.next();
                        System.out.print("Masukan nim: ");
                        nim[i] = scanner.next();
                        System.out.print("Masukan ipk: ");
                        ipk[i] = scanner.nextFloat();
                    }
                    break;
                case 1:
                    if (n == 0)
                        System.out.println("Masukkan data terlebih dahulu!");
                    else
                        for (int i = 0; i < n; i++) {
                            System.out.println("Data ke-" + (i + 1));
                            System.out.println("Nama: " + nama[i]);
                            System.out.println("NIM: " + nim[i]);
                            System.out.println("IPK: " + ipk[i]);
                        }
                    break;
                case 2:
                    if (n == 0)
                        System.out.println("Masukkan data terlebih dahulu!");
                    else {
                        System.out.print("Masukan nama yang dicari: ");
                        String temp = scanner.next();
                        for (int i = 0; i < n; i++) {
                            if (nama[i].equalsIgnoreCase(temp)) {
                                System.out.println("Data ketemu pada posisi ke-" + (i + 1));
                                System.out.println("Nama: " + nama[i]);
                                System.out.println("NIM: " + nim[i]);
                                System.out.println("IPK: " + ipk[i]);
                                break;
                            }
                        }
                    }
                    break;
            }
        } while (choose != 3);
    }
}
