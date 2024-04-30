import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = scanner.nextInt();
        int a0 = scanner.nextInt();
        int c = scanner.nextInt();
        int n0 = scanner.nextInt();

        for (int n = n0; n <= 100; n++) { // n은 n0부터 100까지의 값을 가질 수 있음
            int fn = a1 * n + a0;
            if (fn > c * n) {
                System.out.println(0); // 조건을 만족하지 않음
                return;
            }
        }
        System.out.println(1); // 모든 n에 대해 조건을 만족함

        scanner.close();
    }
}
