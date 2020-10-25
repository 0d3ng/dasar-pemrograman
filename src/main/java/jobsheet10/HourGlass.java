/*
 * jobsheet

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Oct 30, 2019 2:45:36 PM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package jobsheet10;

import java.util.Scanner;

/**
 *
 * @author od3ng
 */
public class HourGlass {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan baris: ");
        int baris = s.nextInt();
        int x = baris * 2 - 1;

        for (int i = 0; i < baris; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < x; k++) {
                System.out.print("*");
            }
            x -= 2;
            System.out.println();
        }

        x = 3;
        for (int i = 1; i < baris; i++) {
            for (int j = i; j < baris - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < x; k++) {
                System.out.print("*");
            }
            x += 2;
            System.out.println();
        }
    }
}
