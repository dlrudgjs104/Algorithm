import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long sum = 1;
        int i = 0;

        while(sum < n){
            i++;
            sum += 6 * i;
        }
        System.out.println(i + 1);
        
        scanner.close();
    }
}