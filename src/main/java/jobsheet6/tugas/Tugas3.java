package jobsheet6.tugas;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        String makanan;
        int harga, ongkir;
        char pengiriman;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nama makanan                      :");
        makanan = scanner.nextLine();
        System.out.print("Masukan harga makanan                     :");
        harga = scanner.nextInt();
        System.out.print("Apakah Anda ingin pengiriman express(y/n) :");
        pengiriman = scanner.next().charAt(0);
        if (pengiriman == 'y') {
            if (harga < 100000)
                ongkir = 20000 + 25000;
            else
                ongkir = 30000 + 25000;
        } else {
            if (harga < 100000)
                ongkir = 20000;
            else
                ongkir = 30000;
        }
        int bayar = harga + ongkir;
        System.out.println("STRUK PEMBELIAN");
        System.out.println("" + makanan + "          Rp" + harga);
        System.out.println("Biaya pengiriman    " + "Rp" + ongkir);
        System.out.println("TOTAL               " + "Rp" + bayar);
    }
}
