package jobsheet5;

import java.util.Scanner;

public class Pemilihan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan sebuah bilangan: ");
        int nilai = scanner.nextInt();
        if (nilai >= 100)
            nilai += 10;
        else nilai -= 10;
        System.out.println("Hasil nilai akhir:  " + nilai);

    }


}
