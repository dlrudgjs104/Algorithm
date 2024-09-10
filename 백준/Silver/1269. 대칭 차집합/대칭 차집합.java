import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> ab = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            Integer number = scanner.nextInt();
            a.add(number);
        }

        for (int i = 0; i < m; i++) {
            Integer number = scanner.nextInt();
            b.add(number);
        }

        ab.addAll(a);
        ab.addAll(b);
        
        System.out.println(a.size() + b.size() - (a.size() + b.size() - ab.size()) * 2 );

        scanner.close();
    }

}
