import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long x = scanner.nextLong();
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            long a = scanner.nextLong();
            int b = scanner.nextInt();
            sum += a * b;
        }

        if (sum == x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}