package perulangan2;

import java.util.Scanner;

public class TownTemps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temps[][] = new double[5][7];
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }
//        tampilkan isi array
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print(temps[i][j] + " ");
            }
            System.out.println();
        }

        int i = 1;
        for (double categories[] : temps) {
            System.out.print("Kota ke-" + i + ": ");
            for (double temp : categories) {
                System.out.print(temp + " ");
            }
            System.out.println();
            i++;
        }
    }
}
