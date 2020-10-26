/*
 * jobsheet

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Oct 30, 2019 2:08:30 PM
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
public class Quiz {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            System.out.println("number: "+number);
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);
            } while (!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
            menu = input.findInLine(".").charAt(0);
            input.nextLine();
        } while (menu == 'y' || menu == 'Y');
    }
}
