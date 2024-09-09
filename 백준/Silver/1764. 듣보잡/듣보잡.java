import java.util.ArrayList;
import java.util.Collections;
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

        Set<String> notListeningPerson = new HashSet<>();
        List<String> notListeningSeeingPerson = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            notListeningPerson.add(name);
        }

        for (int i = 0; i < m; i++) {
            String name = scanner.nextLine();
            if (notListeningPerson.contains(name)) {
                notListeningSeeingPerson.add(name);
            }
        }

        Collections.sort(notListeningSeeingPerson);

        System.out.println(notListeningSeeingPerson.size());

        for (int i = 0; i < notListeningSeeingPerson.size(); i++) {
            System.out.println(notListeningSeeingPerson.get(i));
        }

        scanner.close();
    }

}
