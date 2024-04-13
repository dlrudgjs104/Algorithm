import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int padding;

        for (int i = 1; i <= 2 * n - 1; i++) {

            StringBuilder str = new StringBuilder();

            if (i <= n) {
                padding = n - i;

                for (int j = 0; j < padding; j++) {
                    str.append(" ");
                }

                for (int j = 0; j < 2 * i - 1; j++) {
                    str.append("*");
                }

            } else {
                padding = i - n;

                for (int j = 0; j < padding; j++) {
                    str.append(" ");
                }

                for (int j = 0; j < 2 * (2 * n - 1 - i) + 1; j++) {
                    str.append("*");
                }
            }

            System.out.println(str);

        }

    }
}
