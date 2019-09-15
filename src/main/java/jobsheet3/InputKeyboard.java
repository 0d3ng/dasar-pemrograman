package jobsheet3;

import java.util.Scanner;

public class InputKeyboard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan nama: ");
        String nama = keyboard.next();
        System.out.print("Masukan nilai: ");
        float nilai = keyboard.nextFloat();
        System.out.println(nama);
        System.out.println(nilai);
    }
}
