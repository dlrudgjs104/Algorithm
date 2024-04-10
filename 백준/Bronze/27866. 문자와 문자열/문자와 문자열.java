import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int n = scanner.nextInt() - 1;

        System.out.println(s.charAt(n));
        
        scanner.close(); 
    }
}
