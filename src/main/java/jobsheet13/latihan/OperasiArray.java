package jobsheet13.latihan;

import java.util.Scanner;

public class OperasiArray {
    public static void main(String[] args) {
        int pilih = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Pilih menu: ");
            System.out.println("1. Tambah matriks");
            System.out.println("2. Kurang matriks");
            System.out.println("3. Nilai maksimum baris");
            System.out.println("4. Keluar");
            System.out.print("Pilih [1-4]: ");
            pilih = scanner.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Matriks A");
                    System.out.print("Masukan jumlah baris: ");
                    int barisA = scanner.nextInt();
                    System.out.print("Masukan jumlah kolom: ");
                    int kolomA = scanner.nextInt();
                    int matriksA[][] = new int[barisA][kolomA];
                    for (int i = 0; i < barisA; i++) {
                        for (int j = 0; j < kolomA; j++) {
                            System.out.print("matrikA[" + i + "," + j + "]: ");
                            matriksA[i][j] = scanner.nextInt();
                        }
                    }
                    System.out.println("Matriks B");
                    System.out.print("Masukan jumlah baris: ");
                    int barisB = scanner.nextInt();
                    System.out.print("Masukan jumlah kolom: ");
                    int kolomB = scanner.nextInt();
                    if (barisA == barisB && kolomA == kolomB) {
                        int matriksB[][] = new int[barisB][kolomB];
                        int matriksC[][] = new int[barisB][kolomB];
                        for (int i = 0; i < barisB; i++) {
                            for (int j = 0; j < kolomB; j++) {
                                System.out.print("matrikB[" + i + "," + j + "]: ");
                                matriksB[i][j] = scanner.nextInt();
                            }
                        }
                        for (int i = 0; i < barisB; i++) {
                            for (int j = 0; j < kolomB; j++) {
                                matriksC[i][j] = matriksA[i][j] + matriksB[i][j];
                            }
                        }
                        System.out.println("Hasil matriks A+B");
                        for (int array1D[] : matriksC) {
                            for (int i : array1D) {
                                System.out.print(i + " ");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Jumlah baris dan kolom harus sama");
                    }
                    break;
                case 2:
                    System.out.println("Matriks A");
                    System.out.print("Masukan jumlah baris: ");
                    barisA = scanner.nextInt();
                    System.out.print("Masukan jumlah kolom: ");
                    kolomA = scanner.nextInt();
                    matriksA = new int[barisA][kolomA];
                    for (int i = 0; i < barisA; i++) {
                        for (int j = 0; j < kolomA; j++) {
                            System.out.print("matrikA[" + i + "," + j + "]: ");
                            matriksA[i][j] = scanner.nextInt();
                        }
                    }
                    System.out.println("Matriks B");
                    System.out.print("Masukan jumlah baris: ");
                    barisB = scanner.nextInt();
                    System.out.print("Masukan jumlah kolom: ");
                    kolomB = scanner.nextInt();
                    if (barisA == barisB && kolomA == kolomB) {
                        int matriksB[][] = new int[barisB][kolomB];
                        int matriksC[][] = new int[barisB][kolomB];
                        for (int i = 0; i < barisB; i++) {
                            for (int j = 0; j < kolomB; j++) {
                                System.out.print("matrikB[" + i + "," + j + "]: ");
                                matriksB[i][j] = scanner.nextInt();
                            }
                        }
                        for (int i = 0; i < barisB; i++) {
                            for (int j = 0; j < kolomB; j++) {
                                matriksC[i][j] = matriksA[i][j] - matriksB[i][j];
                            }
                        }
                        System.out.println("Hasil matriks A-B");
                        for (int array1D[] : matriksC) {
                            for (int i : array1D) {
                                System.out.print(i + " ");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Jumlah baris dan kolom harus sama");
                    }
                    break;
                case 3:
                    System.out.print("Masukan jumlah baris: ");
                    barisA = scanner.nextInt();
                    System.out.print("Masukan jumlah kolom: ");
                    kolomA = scanner.nextInt();
                    matriksA = new int[barisA][kolomA];
                    for (int i = 0; i < barisA; i++) {
                        for (int j = 0; j < kolomA; j++) {
                            System.out.print("matrikA[" + i + "," + j + "]: ");
                            matriksA[i][j] = scanner.nextInt();
                        }
                    }
                    for (int array1D[] : matriksA) {
                        for (int x : array1D) {
                            System.out.print(x + " ");
                        }
                        System.out.println();
                    }

                    int maxKolom = Integer.MIN_VALUE;
                    for (int i = 0; i < barisA; i++) {
                        int maxBaris = Integer.MIN_VALUE;
                        int valueBaris = 0;
                        for (int j = 0; j < kolomA; j++) {
                            if (matriksA[i][j] > maxBaris) {
                                valueBaris = matriksA[i][j];
                            }
                        }
                        System.out.println("nilai max baris ke-" + (i + 1) + ": " + valueBaris);
                    }
                    break;
            }
        } while (pilih != 4);
    }
}
