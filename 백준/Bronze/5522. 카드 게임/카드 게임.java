import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int result = 0;
        for(int i = 0; i <5; i++) {
            result += s.nextInt();
        }

        System.out.println(result);
    }

}

