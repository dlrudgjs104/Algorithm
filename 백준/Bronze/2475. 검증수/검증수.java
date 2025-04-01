import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int result = 0;
        for (int i = 0; i < 5; i++) {
            result += Math.pow(s.nextInt(), 2);
        }

        result %= 10;

        System.out.println(result);
    }

}

