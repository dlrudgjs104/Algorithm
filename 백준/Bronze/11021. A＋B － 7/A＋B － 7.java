import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        StringBuilder str = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            str.append(String.format("Case #%d: %d\n", i, a + b));
        }
        System.out.println(str);
    }
}
