package perulangan2;

public class Bintang2 {
    public static void main(String[] args) {
        int max = 9;
        int increment = max;
        for (int baris = 1; baris <= max; baris++) {
            for (int kolom = 10-baris; kolom > 0; kolom--) {
                if (kolom == increment)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            increment--;
            System.out.println();
        }
    }
}
