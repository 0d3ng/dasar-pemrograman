package jobsheet15;

public class Tugas {
    static void deret(int x) {
        if (x > 0) {
            System.out.print(x + " ");
            deret(x - 1);
        } else {
            System.out.println();
        }
    }

    static int jumlah(int x) {
        System.out.print(x+" ");
        if (x == 1) {
            return 1;
        } else {
            return x + (jumlah(x - 1));
        }
    }

    public static void main(String[] args) {
        deret(5);
        System.out.println(jumlah(8));
    }
}
