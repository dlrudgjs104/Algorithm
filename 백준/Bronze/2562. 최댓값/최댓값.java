import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int index = 0;
        
        for(int i = 1; i <= 9; i++) {
            int a = scanner.nextInt();
            if (a > max){
                max = a;
                index = i;
            }
        }

        System.out.printf("%d\n%d", max, index);

        scanner.close(); 
    }
}
