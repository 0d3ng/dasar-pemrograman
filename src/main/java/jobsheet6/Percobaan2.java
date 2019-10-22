/*
 * jobsheet

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Oct 1, 2019 10:37:54 PM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package jobsheet6;

import java.util.Scanner;

/**
 * @author od3ng
 */
public class Percobaan2 {
    public static void main(String[] args) {
        String kategori;
        int penghasilan, gajiBersih = 0;
        double pajak;
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan kategori    : ");
        kategori = s.nextLine();
        System.out.print("Masukan penghasilan : ");
        penghasilan = s.nextInt();
        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (gajiBersih * pajak));
            System.out.println("Gaji bersih yang Anda terima Rp." + gajiBersih);
        } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (gajiBersih * pajak));
            System.out.println("Gaji bersih yang Anda terima Rp." + gajiBersih);
        } else {
            System.out.println("Kategori yang Anda masukan salah!");
        }
    }
}
