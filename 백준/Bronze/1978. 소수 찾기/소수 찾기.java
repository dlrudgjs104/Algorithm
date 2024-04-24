import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int minorityCount = 0;

        for(int i = 0; i < n; i++){
            int number = scanner.nextInt();
            int count = 0;

            if(number == 1){
                continue;
            }

            for(int j = 2; j < number; j++){
                if(number % j == 0){
                    count++;
                }
            }

            if(count == 0){
                minorityCount++;
            }
        }

        System.out.println(minorityCount);

        scanner.close();
    }
}
