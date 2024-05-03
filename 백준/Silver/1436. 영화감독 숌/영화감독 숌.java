import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int count = 665;
        int number = 0;

        while (n > 0) {
            count++;
            String countStr = String.valueOf(count);
            for (int i = 0; i < countStr.length() - 2; i++) {
                if (countStr.contains("666")) {
                    number = count;
                    n--;
                    break;
                }
            }
        }

        System.out.println(number);

        scanner.close();
    }
}
