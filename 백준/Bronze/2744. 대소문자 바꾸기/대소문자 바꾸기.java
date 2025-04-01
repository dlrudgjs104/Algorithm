import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                result.append(Character.toLowerCase(input.charAt(i)));
            } else {
                result.append(Character.toUpperCase(input.charAt(i)));
            }
            
        }
        
        System.out.println(result);
    }

}

