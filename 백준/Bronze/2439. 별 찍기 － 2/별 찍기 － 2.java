import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        StringBuilder str;

        for (int i = 1; i <= n; i++) {
            str = new StringBuilder();
            for(int j = n - i; j >= 1; j--){
                str.append(" ");
            }

            for(int j = 1; j <= i; j++){
                str.append("*");
            }
            
            System.out.println(str);
        }
    }
}
