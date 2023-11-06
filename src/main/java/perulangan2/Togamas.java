package perulangan2;

import java.util.Scanner;

public class Togamas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bookStore[][] = new int[3][3];
        for (int i = 0; i < bookStore.length; i++) {
            System.out.println("Toko ke-" + i);
            for (int j = 0; j < bookStore[0].length; j++) {
                System.out.print("Data ke-" + (j + 1) + ": ");
                bookStore[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
//        tampilkan isi array
//        for (int i = 0; i < bookStore.length; i++) {
//            System.out.print("Toko ke-" + (i + 1) + ": ");
//            for (int j = 0; j < bookStore[0].length; j++) {
//                System.out.print(bookStore[i][j] + " ");
//            }
//            System.out.println();
//        }

        int i = 1;
        for (int categories[] : bookStore) {
            System.out.print("Toko ke-" + i + ": ");
            for (int temp : categories) {
                System.out.print(temp + " ");
            }
            System.out.println();
            i++;
        }
    }
}
