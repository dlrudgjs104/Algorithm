import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int[] array = new int[number.length()];

        for (int i = 0; i < number.length(); i++) {
            array[i] = Integer.parseInt(number.substring(i, i + 1));
        }

        for (int i = 0; i < number.length() - 1; i++) {
            for (int j = 0; j < number.length() - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < number.length(); i++) {
            System.out.printf("%s", array[i]);
        }

        scanner.close();
    }
}
