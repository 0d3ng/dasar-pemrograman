package uts;

import java.util.Scanner;

public class SoalA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah: ");
        int count = sc.nextInt();
        int i = 0;
        while (++i <= count) {
            if (i <= 1 || i == count)
                System.out.print("@");
            else
                System.out.print("#");
        }
    }
}
