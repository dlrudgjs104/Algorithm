import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int[] array = new int[5];

        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println(sum / 5);
        System.out.println(array[2]);
        scanner.close();
    }
}
