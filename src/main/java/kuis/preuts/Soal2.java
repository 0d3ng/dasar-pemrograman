package kuis.preuts;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        System.out.println(String.format(" %s Menghitung sisa roti %s",'\u272F','\u272F'));
        final float roti = 1F;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dibagikan ke Tono     :");
        float tono = scanner.nextFloat();
        System.out.print("Dibagikan ke Ponakan  :");
        float ponakan = scanner.nextFloat();
        System.out.print("Dibagikan ke Tetangga :");
        float tetangga = scanner.nextFloat();
        float sisa = roti - tono - ponakan - tetangga;
        System.out.println(String.format("Sisa roti Ibu Wati adalah %f ", sisa));
    }
}
