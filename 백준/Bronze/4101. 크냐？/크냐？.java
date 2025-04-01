import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a == 0) {
                return;
            }

            if (a > b) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}

