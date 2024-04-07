import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int b1 = b % 10;
        int b2 = b % 100 / 10;
        int b3 = b / 100;

        int result;

        System.out.println(a * b1);
        System.out.println(a * b2);
        System.out.println(a * b3);
        System.out.println(a * (b1 + b2 * 10 + b3 * 100));
    }
}