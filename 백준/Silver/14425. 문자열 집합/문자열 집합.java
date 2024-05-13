import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        HashSet<String> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            set.add(scanner.nextLine());
        }

        for (int i = 0; i < m; i++) {
            if (set.contains(scanner.nextLine())) {
                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}