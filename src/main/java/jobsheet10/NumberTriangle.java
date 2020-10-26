/*
 * jobsheet

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Oct 30, 2019 2:37:10 PM
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
public class NumberTriangle {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan baris: ");
        int baris = s.nextInt();
        for (int i = 1; i <= baris; i++) {

            for (int j = 1; j <= baris - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

//            for (int j = i - 1; j >= 1; j--) {
//                System.out.print(j);
//            }
            System.out.println();
        }
    }
}
