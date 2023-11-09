package perulangan2;

public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {6, 5, 3, 1, 8, 7, 2, 4};
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        for (int dt : data) {
            System.out.print(dt + " ");
        }
    }
}
