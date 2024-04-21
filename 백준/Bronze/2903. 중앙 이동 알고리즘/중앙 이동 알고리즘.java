import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int start = 2;

        for(int i = 0; i < n; i++){
            start = start + start -1;
        }
        
        System.out.println(start * start);

        scanner.close();
    }
}