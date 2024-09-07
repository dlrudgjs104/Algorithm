import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        Map<String, Integer> names = new HashMap<>();
        Map<Integer, String> numbers = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            names.put(name, i);
            numbers.put(i, name);
        }

        for (int i = 0; i < m; i++) {
            String question = scanner.nextLine();
            if (isName(question)) {
                System.out.println(names.get(question));
            } else {
                System.out.println(numbers.get(Integer.valueOf(question)));
            }
                
        }
        scanner.close();
    }

    private static boolean isName(String str) {
        return str.charAt(0) >= 65 && str.charAt(0) <=90;
    }
}
