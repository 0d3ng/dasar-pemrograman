/*
 * jobsheet

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Oct 30, 2019 2:53:28 PM
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
public class NumberSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan baris: ");
        int baris = s.nextInt();
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < baris; j++) {
                if (i==0||i==baris-1||j==0||j==baris-1) {
                    char heart = '\u263A';
                    System.out.print(heart);
//                    System.out.print(""+baris);
                }else{
                    char heart = '\u2764';
                    System.out.print(heart);
                }
                
            }
            System.out.println("");
        }
    }
}
