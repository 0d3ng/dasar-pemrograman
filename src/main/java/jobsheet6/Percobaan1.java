/*
 * jobsheet

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Oct 1, 2019 10:30:07 PM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package jobsheet6;

import java.util.Scanner;

/**
 *
 * @author od3ng
 */
public class Percobaan1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan nilai (0-100): ");
        int nilai = s.nextInt();
        if (nilai >= 0 && nilai <= 100) {
            if (nilai >= 90 && nilai <= 100) {
                System.out.println("Nilai A, Excellent!");
            } else if (nilai >= 80 && nilai < 90) {
                System.out.println("Nilai B, pertahankan prestasi Anda!");
            } else if (nilai >= 60 && nilai < 80) {
                System.out.println("Nilai C, tingkatkan prestasi Anda!");
            }else if (nilai >= 50 && nilai < 60) {
                System.out.println("Nilai D, tingkatkan belajar Anda!");
            }else {
                System.out.println("Nilai E, Anda tidak lulus!");
            }
        } else {
            System.out.println("Nilai yang anda masukan tidak valid");
        }
    }

}
