import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < n; i++){
            String s = scanner.nextLine();
            System.out.printf("%c%c\n", s.charAt(0), s.charAt(s.length() - 1));
        }
        
        scanner.close(); 
    }
}
