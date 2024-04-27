import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[3];

        while (true) {
            int sum = 0;
            int max = 0;

            for (int i = 0; i < 3; i++) {
                array[i] = scanner.nextInt();
            }

            for (int i = 0; i < 3; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
                sum += array[i];
            }

            sum -= max;

            if (array[0] == 0 && array[0] == array[1] && array[1] == array[2]) {
                break;
            } else {
                if (max < sum) {
                    if (array[0] == array[1] && array[1] == array[2]) {
                        System.out.println("Equilateral");
                    } else if (array[0] == array[1] || array[1] == array[2] || array[2] == array[0]) {
                        System.out.println("Isosceles");
                    } else {
                        System.out.println("Scalene");
                    }
                } else {
                    System.out.println("Invalid");
                }

            }
        }

        scanner.close();
    }
}