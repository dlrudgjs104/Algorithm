import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String text2 = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            text2 += text.charAt(i);
        }

        if (text.equals(text2)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}