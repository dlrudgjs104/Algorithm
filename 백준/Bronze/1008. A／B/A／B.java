import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                if (a > 0 && a < 10 && b > 0 && b < 10) {
                    System.out.println((double) a / b);
                    break;
                }
            }

            scanner.close();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}