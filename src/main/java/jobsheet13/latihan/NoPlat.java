package jobsheet13.latihan;

public class NoPlat {
    public static void main(String[] args) {
        char KODE[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char plate[][] = {
                {'B', 'A', 'N', 'T', 'E', 'N'},
                {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
                {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
                {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
                {'B', 'O', 'G', 'O', 'R'},
                {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
                {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
                {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
                {'M', 'A', 'L', 'A', 'N', 'G'},
                {'T', 'E', 'G', 'A', 'L'},
        };
        int index = 0;
        for (char array1D[] : plate) {
            System.out.print(KODE[index] + " - ");
            for (char c : array1D) {
                System.out.print(c + " ");
            }
            System.out.println();
            index++;
        }
    }
}
