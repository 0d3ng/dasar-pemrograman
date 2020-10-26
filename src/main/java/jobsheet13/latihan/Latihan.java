package jobsheet13.latihan;

public class Latihan {
    public static void latihanOne() {
        String frames[][] = new String[5][5];
        for (int i = 0; i < frames.length; i++) {
            for (int j = 0; j < frames[0].length; j++) {
                if ((i == 0 || i == frames.length - 1) || (j == 0 || j == frames[0].length - 1)) {
                    frames[i][j] = "*";
                } else
                    frames[i][j] = "";
            }
        }
        for (String array1D[] : frames) {
            for (String array : array1D) {
                System.out.print(array + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        latihanOne();
    }
}
