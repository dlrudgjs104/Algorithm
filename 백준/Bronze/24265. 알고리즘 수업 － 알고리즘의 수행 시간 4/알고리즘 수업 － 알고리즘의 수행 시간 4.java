import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        System.out.println((long)(0.5 * n * (n - 1)));

        System.out.println(2);

        scanner.close();
    }
}
