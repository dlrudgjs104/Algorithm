import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.nextLine();
        String b = s.nextLine();

        if (a.length() >= b.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }

    }

}

