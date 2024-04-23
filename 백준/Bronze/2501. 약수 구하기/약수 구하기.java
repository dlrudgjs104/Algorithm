import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int i = 1;
        int count = 1;

        while(true){
            if(i <= n){
                if(n % i == 0){
                    if(count == k){
                        System.out.println(i);
                        break;
                    }
                    count++;
                }
                i++;
    
            }else{
                System.out.println(0);
                break;
            }
        }
        
        scanner.close();
    }
}
