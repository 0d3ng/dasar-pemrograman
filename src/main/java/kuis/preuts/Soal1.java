package kuis.preuts;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(String.format(" %s Menghitung umur Badu %s",'\u2764','\u2764'));
        System.out.print("Masukan tanggal sekarang:");
        int tanggal = scanner.nextInt();
        System.out.print("Masukan bulan sekarang:");
        int bulan = scanner.nextInt();
        System.out.print("Masukan tahun sekarang:");
        int tahun = scanner.nextInt();
        System.out.println(String.format("Tanggal sekarang %d-%d-%d\n", tanggal, bulan, tahun));
        System.out.print("Masukan tanggal lahir:");
        int tanggalLahir = scanner.nextInt();
        System.out.print("Masukan bulan lahir:");
        int bulanLahir = scanner.nextInt();
        System.out.print("Masukan tahun lahir:");
        int tahunLahir = scanner.nextInt();
        System.out.println(String.format("Tanggal lahir %d-%d-%d\n", tanggalLahir, bulanLahir, tahunLahir));
        int umur = tahun - tahunLahir;
        int bln = bulan - bulanLahir;
        int hari = tanggal - tanggalLahir;
        System.out.println(String.format("Umur Badu adalah %d tahun %d bulan %d hari", umur, bln, hari));
    }
}
