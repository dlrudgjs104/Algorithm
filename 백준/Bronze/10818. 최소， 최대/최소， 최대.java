import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long a = scanner.nextLong();
        long max = a;
        long min = a;
        
        for(int i = 0; i < n - 1; i++) {
            a = scanner.nextLong();
            if (a < min){
                min = a;
            }else if (a > max){
                max = a;
            }
        }

        System.out.printf("%d %d", min, max);

        scanner.close(); 
    }
}
