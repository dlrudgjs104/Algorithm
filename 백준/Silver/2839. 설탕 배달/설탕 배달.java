import java.util.Scanner;

public class Main {

    public static int counter(int n) {
        int count = 0;

        for (int i = 0; i <= n / 3; i++) {
            int n2 = n;
            n2 = n2 - 3 * i;

            if (n2 != 0) {
                for (int j = 0; j <= n2 / 5; j++) {
                    int n3 = n2;
                    n3 = n3 - 5 * j;

                    if (n3 == 0) {
                        count = i + j;
                        return count;
                    }
                }
            } else {
                count = i;
                return count;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(counter(n));

        scanner.close();
    }
}
