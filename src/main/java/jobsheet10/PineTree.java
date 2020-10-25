/*
 * jobsheet

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Oct 30, 2019 3:14:32 PM
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
public class PineTree {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tinggi;
        int stars;
        int level;
        System.out.print("Masukan tinggi: ");
        tinggi = sc.nextInt();
        System.out.print("Masukan level: ");
        level = sc.nextInt();
        int szelesseg = tinggi - 1;
        if (tinggi <= 0) {
            throw new Exception("height is negative");
        }
        if (level <= 0) {
            throw new Exception("level is negative");
        }

        for (int h = 0; h < level; h++) {
            stars = 1;
            for (int i = 0; i < tinggi; i++) {
                for (int j = szelesseg; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k < stars; k++) {
                    System.out.print("*");
                }
                stars += 2;
                System.out.println();
            }
        }

//        for (int talp = 1; talp <= 3; talp++) {
//            System.out.println("   ***");
//        }
    }
}
