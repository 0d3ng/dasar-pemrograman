package jobsheet13.latihan;

import java.util.Scanner;

public class MahasiswaArray3D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan jumlah mahasiswa: ");
        int mhs = scanner.nextInt();
        int jurusan[][][] = new int[5][mhs][3];
        System.out.println(jurusan.length);
        System.out.println(jurusan[0].length);
        System.out.println(jurusan[0][1].length);
        for (int i = 0; i < jurusan.length; i++) {
            for (int j = 0; j < jurusan[0].length; j++) {
                for (int k = 0; k < jurusan[0][1].length; k++) {
                    System.out.print("Masukan nilai[" + i + "," + j + "," + k + "]: ");
                    jurusan[i][j][k] = scanner.nextInt();
                }
                System.out.println();
            }
        }
        for (int array2D[][] : jurusan) {//kelas
            for (int array1D[] : array2D) {//mahasiswa
                float rerata = 0F;
                int total = 0;
                for (int arr : array1D) {//nilai
                    System.out.print(arr + " ");
                    total += arr;
                }
                System.out.println();
                rerata = (float) total / 3;
                System.out.println("Nilai total mhs-" + total);
                System.out.println("Nilai rata2 mhs-" + rerata);
                System.out.println();
            }
            System.out.println();
        }
    }
}
