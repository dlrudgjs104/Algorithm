import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            String input = s.nextLine();

            if (input.equals("#")) {
                return;
            }
    
            int count = 0;
            for (int i = 0; i < input.length(); i++) {
                char ch = Character.toLowerCase(input.charAt(i));
                if ("aeiou".contains(String.valueOf(ch))) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
