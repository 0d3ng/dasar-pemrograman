package jobsheet13;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
//        int[][] ratings = new int[3][4];
//        ratings[0][0] = 1;
//        ratings[0][1] = 2;
//        ratings[0][2] = 3;
//        ratings[0][3] = 4;
//        ratings[1][0] = 1;
//        ratings[1][1] = 2;
//        ratings[1][2] = 3;
//        ratings[1][3] = 4;

//        int[][] ratings = new int[3][4];
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print("Masukan array[" + i + "," + j + "]: ");
//                ratings[i][j] = scanner.nextInt();
//            }
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(ratings[i][j] + " ");
//            }
//            System.out.println();
//        }

//        int[][] ratings = new int[3][4];
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < ratings.length; i++) {
//            for (int j = 0; j < ratings[0].length; j++) {
//                System.out.print("Masukan array[" + i + "," + j + "]: ");
//                ratings[i][j] = scanner.nextInt();
//            }
//        }
//
//        for (int i = 0; i < ratings.length; i++) {
//            for (int j = 0; j < ratings[0].length; j++) {
//                System.out.print(ratings[i][j] + " ");
//            }
//            System.out.println();
//        }

//        int[][] ratings = new int[3][4];
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < ratings.length; i++) {
//            for (int j = 0; j < ratings[0].length; j++) {
//                System.out.print("Masukan array[" + i + "," + j + "]: ");
//                ratings[i][j] = scanner.nextInt();
//            }
//        }
//
//        for (int rate[] : ratings) {
//            for (int i : rate) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

//        int[][] ratings = new int[3][4];
//        Scanner scanner = new Scanner(System.in);
//        int total = 0;
//        for (int i = 0; i < ratings.length; i++) {
//            for (int j = 0; j < ratings[0].length; j++) {
//                System.out.print("Masukan array[" + i + "," + j + "]: ");
//                ratings[i][j] = scanner.nextInt();
//                total += ratings[i][j];
//            }
//        }
//
//        for (int rate[] : ratings) {
//            for (int i : rate) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
//        float rerata = (float) total / (ratings.length * ratings[0].length);
//        System.out.println("Nilai total : " + total);
//        System.out.println("Nilai rerata: " + rerata);


//        int[][] ratings = new int[3][4];
//        Scanner scanner = new Scanner(System.in);
//        int total = 0;
//        for (int i = 0; i < ratings.length; i++) {
//            for (int j = 0; j < ratings[0].length; j++) {
//                System.out.print("Masukan array[" + i + "," + j + "]: ");
//                ratings[i][j] = scanner.nextInt();
//                if (i == 0)
//                    total += ratings[i][j];
//            }
//        }
//
//        for (int rate[] : ratings) {
//            for (int i : rate) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
//        float rerata = (float) total / ratings[0].length;
//        System.out.println("Nilai total : " + total);
//        System.out.println("Nilai rerata: " + rerata);

        int matriksA[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int matriksB[][] = {{2, 2, 3, 4}, {5, 4, 1, 2}};
        int matriksC[][] = new int[matriksA.length][matriksA[0].length];
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksA[0].length; j++) {
                matriksC[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }
        System.out.println("Matriks A");
        for (int A[] : matriksA) {
            for (int x : A) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println("Matriks B");
        for (int A[] : matriksB) {
            for (int x : A) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println("Hasil");
        for (int A[] : matriksC) {
            for (int x : A) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
