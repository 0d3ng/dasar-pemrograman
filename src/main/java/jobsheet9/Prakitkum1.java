/*
 * jobsheet

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Oct 23, 2019 1:23:44 PM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package jobsheet9;

import java.util.Scanner;

/**
 *
 * @author od3ng
 */
public class Prakitkum1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukan angka: ");
        int angka = s.nextInt();
        int fac = 1;
        for (int i = 1; i <= angka; i++) {
            fac *= i; 
            System.out.println("iterasi ke-["+i+"] "+fac);
        }
        System.out.println("hasil: "+fac);
    }
}
