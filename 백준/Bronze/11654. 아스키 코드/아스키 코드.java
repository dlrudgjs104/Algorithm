import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char c = scanner.next().charAt(0);

        System.out.printf("%d", (int) c);
        
        scanner.close(); 
    }
}
