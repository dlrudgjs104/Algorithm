import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] card = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            card[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 2; i++) {
            int sum1 = 0;
            sum1 += card[i];
            for (int j = i + 1; j < n - 1; j++) {
                int sum2 = sum1 + card[j];
                
                for (int k = j + 1; k < n; k++) {
                    int sum3 = sum2 + card[k];

                    if (sum3 > max && sum3 <= m) {
                        max = sum3;
                    }
                }
            }
        }

        System.out.println(max);

        scanner.close();
    }
}
