package kuis2;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nilai[][] = null;
        for (; ; ) {
            System.out.println("1. Masukan array");
            System.out.println("2. Hitung rata-rata diagonal kanan");
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
                    nilai = new int[ukuran][ukuran];
                    for (int i = 0; i < ukuran; i++) {
                        for (int j = 0; j < ukuran; j++) {
                            System.out.print("[" + i + "," + j + "]: ");
                            nilai[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    System.out.println("isi matriks");
                    for (int array1D[] : nilai) {
                        for (int arr : array1D) {
                            System.out.print(arr + " ");
                        }
                        System.out.println();
                    }
                    int total = 0;
                    System.out.println("Nilai diagonal kanan: ");
                    for (int i = 0, x = 0, y = nilai.length - 1; i < nilai.length; i++) {
                        for (int j = 0; j < nilai[0].length; j++) {
                            if (i == x && y == j) {
                                total += nilai[i][j];
                                System.out.print(nilai[i][j] + " ");
                            }
                        }
                        x++;
                        y--;
                    }
                    System.out.println();
                    System.out.println("Nilai total : " + total);
                    float rata = (float) total / nilai.length;
                    System.out.println("Nilai rata  :" + rata);
                    break;
            }
            System.out.println();
            System.out.println();
        }
    }
}
