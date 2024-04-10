import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int compare;
        
        for(int i = 0; i < n; i++) {
            compare = scanner.nextInt();
            if(compare < x){
                System.out.print(compare + " ");    
            }
        }

        scanner.close(); 
    }
}
