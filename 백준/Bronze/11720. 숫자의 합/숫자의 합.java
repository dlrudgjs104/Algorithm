import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        int sum = 0;

        String str = scanner.nextLine();

        for(int i = 0; i < n; i++){
            sum += str.charAt(i) - 48;
        }
        
        System.out.println(sum);
        
        scanner.close(); 
    }
}
