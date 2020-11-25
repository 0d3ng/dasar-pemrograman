package kuis2;

import java.io.*;
import java.util.Scanner;

public class Soal4b {
    public static void main(String[] args) throws IOException {
        int choose = 0;
        int n = 0;
        String[] nama = new String[0];
        String[] kategori = new String[0];
        float[] harga = new float[0];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n***Sistem informasi barang***");
            System.out.println("0. Input data barang");
            System.out.println("1. Menampilkan barang");
            System.out.println("2. Menampilkan barang harga 10000-50000");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 0:
                    System.out.print("Masukan banyaknya data: ");
                    n = scanner.nextInt();
                    nama = new String[n];
                    kategori = new String[n];
                    harga = new float[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Masukan nama: ");
                        nama[i] = reader.readLine();
                        System.out.print("Masukan kategori: ");
                        kategori[i] = reader.readLine();
                        System.out.print("Masukan harga: ");
                        harga[i] = scanner.nextFloat();
                    }
                    break;
                case 1:
                    if (n == 0)
                        System.out.println("Masukkan data terlebih dahulu!");
                    else
                        for (int i = 0; i < n; i++) {
                            System.out.println("Data ke-" + (i + 1));
                            System.out.println("Nama    : " + nama[i]);
                            System.out.println("Kategori: " + kategori[i]);
                            System.out.println("Harga   : " + harga[i]);
                        }
                    break;
                case 2:
                    if (n == 0)
                        System.out.println("Masukkan data terlebih dahulu!");
                    else {
                        for (int i = 0; i < n; i++) {
                            if (harga[i] >=10000 && harga[i]<=50000) {
                                System.out.println("Data ke-" + (i + 1));
                                System.out.println("Nama    : " + nama[i]);
                                System.out.println("Kategori: " + kategori[i]);
                                System.out.println("Harga   : " + harga[i]);
                            }
                        }
                    }
                    break;
            }
        } while (choose != 3);
    }
}
