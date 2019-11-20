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
                    System.out.print("Masukan ukuran matrix: ");

                    int ukuran = scanner.nextInt();
                    nilai = new String[ukuran][ukuran];
                    for (int i = 0; i < ukuran; i++) {
                        for (int j = 0; j < ukuran; j++) {
                            System.out.print("[" + i + "," + j + "]: ");
                            nilai[i][j] = scanner.nextLine();
                        }
                    }
                    break;
                case 2:
                    System.out.println("isi matriks sesuatu");
                    for (String array1D[] : nilai) {
                        for (String arr : array1D) {
                            System.out.print(arr + " ");
                        }
                        System.out.println();
                    }
                    int total = 0;
                    System.out.println("Hasil pencarian: ");
                    for (int i = 0; i < nilai.length; i++) {
                        System.out.print("Masukan nama: ");
                        String cari = scanner.nextLine();
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
            System.out.println();
        }
    }
}
