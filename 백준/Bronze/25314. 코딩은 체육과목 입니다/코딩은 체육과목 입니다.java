import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String str = "int";

        for (int i = 1; i <= n / 4; i++) {
            str = "long " + str;
        }

        System.out.println(str);
    }
}