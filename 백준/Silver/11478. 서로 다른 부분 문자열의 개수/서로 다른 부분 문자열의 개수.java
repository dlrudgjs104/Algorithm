import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Set<String> alphabet = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                alphabet.add(str.substring(i, j));
            }
        }

        System.out.println(alphabet.size());

        scanner.close();
    }

}
