package perulangan2;

public class Bintang {
    public static void main(String[] args) {
        for (int baris = 1; baris <= 10; baris++) {
            for (int kolom = 10 - baris; kolom > 0; kolom--) {
                System.out.print(" ");
            }
            for (int i = 1; i <= baris; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
