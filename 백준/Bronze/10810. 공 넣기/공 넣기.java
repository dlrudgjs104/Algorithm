import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int bucket[] = new int[n];

        for(int index = 0; index < n; index++){
            bucket[index] = 0;
        }

        for(int repeat = 0; repeat < m; repeat++){
            int i = scanner.nextInt() - 1;
            int j = scanner.nextInt() - 1;
            int k = scanner.nextInt();

            for(int index = i; index <= j; index++){
                bucket[index] = k;
            }
        }

        for(int index = 0; index < n; index++){
            System.out.printf("%d ", bucket[index]);
        }

        scanner.close(); 
    }
}
