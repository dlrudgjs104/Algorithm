import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            int sum = 0;
            int count = 1;

            if (n == -1) {
                break;
            }

            int[] array = new int[n];
            int index = 0;

            while (count < n) {
                if (n % count == 0) {
                    sum += count;
                    array[index] = count;
                    index++;
                }
                count++;
            }

            if (n == sum) {
                for (int i = 0; i < index; i++) {
                    if (i == 0) {
                        System.out.printf("%d = %d", n, array[i]);
                    } else {
                        System.out.printf(" + %d", array[i]);
                    }
                }
                System.out.println();
            } else {
                System.out.printf("%d is NOT perfect.\n", n);
            }
        }

        scanner.close();
    }
}
