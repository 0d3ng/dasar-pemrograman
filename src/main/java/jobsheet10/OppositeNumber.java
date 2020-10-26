/*
 * jobsheet

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Oct 30, 2019 3:08:23 PM
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
public class OppositeNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan baris: ");
        int baris = s.nextInt();
        for (int i = 1; i <= baris; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= baris; j++) {
                    System.out.print("" + j);
                }
            } else {
                for (int j = baris; j >= 1; j--) {
                    System.out.print("" + j);
                }
            }

            System.out.println("");
        }
    }
}
