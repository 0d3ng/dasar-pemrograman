package kuis2;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nilai[][] = null;
        for (; ; ) {
            System.out.println("1. Masukan kelompok sesuatu");
            System.out.println("2. Cari dan hitung");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            int pilih = scanner.nextInt();
            if (pilih == 3) {
                break;
            }
            switch (pilih) {
                case 1:
                    System.out.print("Masukan banyaknya kelompok sesuatu: ");

                    int baris = scanner.nextInt();
                    System.out.print("Masukan banyaknya: ");
                    int kolom = scanner.nextInt();
                    nilai = new String[baris][kolom];
                    for (int i = 0; i < baris; i++) {
                        for (int j = 0; j < kolom; j++) {
                            System.out.print("[" + i + "," + j + "]: ");
                            nilai[i][j] = scanner.next();
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("isi matriks sesuatu");
                    for (String array1D[] : nilai) {
                        for (String arr : array1D) {
                            System.out.print(arr + " ");
                        }
                        System.out.println();
                    }

                    System.out.println("Pencarian: ");
                    for (int i = 0; i < nilai.length; i++) {
                        int total = 0;
                        System.out.print("Masukan nama ke-" + (i + 1) + ": ");
                        String cari = scanner.next();
                        int j;
                        for (j = 0; j < nilai[0].length; j++) {
                            if (nilai[i][j].equals(cari)) {
                                total++;
                            }
                        }
                        System.out.println("Nama " + cari + " ketemu " + total + " kali");
                    }
                    break;
            }
            System.out.println();
        }
    }
}
