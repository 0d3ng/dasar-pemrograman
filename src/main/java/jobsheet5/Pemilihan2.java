package jobsheet5;

import java.util.Scanner;

public class Pemilihan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan suhu saat ini:  ");
        int suhu = scanner.nextInt();
        if (suhu < 16) {
            System.out.println("Silahkan pakai jaket");
        } else {
            System.out.println("Silahkan pakai topi");
        }

    }


}
