/*
 * jobsheet

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Oct 30, 2019 3:22:32 PM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package jobsheet10;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author od3ng
 */
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Masukan jumlah prime number: ");
        int n = s.nextInt();
        int hasil = 0;
        for (int i = 1; i < 20; i++) {
            if (hasil == n) {
                break;
            }
            if (i == 2 || i == 3 || i == 5 || i == 7) {
                System.out.print(i + " ");
                hasil++;
            } else {
                if (i % 2 == 1) {
                    System.out.print(i + " ");
                    hasil++;

                }
            }
        }
    }
}
