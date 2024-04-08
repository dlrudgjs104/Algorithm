import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int nArray[] = new int[n];
        int count = 0;

        for(int i = 0; i < n; i++) {
            nArray[i] = scanner.nextInt();
        }

        int compare = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            if(nArray[i] == compare){
                count++;
            }
        }

        System.out.println(count);

        scanner.close(); 
    }
}
