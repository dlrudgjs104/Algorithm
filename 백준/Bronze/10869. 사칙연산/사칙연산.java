import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                if (a >= 1 && a <= 10000 && b >= 1 && b <= 10000) {
                    System.out.println(a + b);
                    System.out.println(a - b);
                    System.out.println(a * b);
                    System.out.println(a / b);
                    System.out.println(a % b);
                    break;
                }
            }

            scanner.close();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}