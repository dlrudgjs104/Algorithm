import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int sum = 0;
        int min = 0;
        int fistcount = 0;

        for(int i = m; i <= n; i++){
            int count = 0;
            
            if(i == 1){
                continue;
            }

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    count++;
                }
            }

            if(count == 0){
                fistcount++;
                if(fistcount == 1){
                    min = i;
                }
                sum += i;
            }
        }

        if(sum == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }

        scanner.close();
    }
}
