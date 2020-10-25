/*
 * jobsheet

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Oct 23, 2019 3:03:16 PM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package jobsheet9;

/**
 *
 * @author od3ng
 */
public class Praktikum3 {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i+=5) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("nilai i: " + i);
        }
    }
}
