package uts;

import java.util.Scanner;

public class SoalB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan total: ");
        int x = scanner.nextInt();
        int i = 0;
        do {
            if (i % 2 == 0)
                System.out.print("*");
            else
                System.out.print("^");
            i++;
        } while (i != x);
    }
}
