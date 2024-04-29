import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        System.out.println((n * n * n - 3 * n * n + 2 * n) / 6);
        System.out.println(3);

        scanner.close();
    }
}
