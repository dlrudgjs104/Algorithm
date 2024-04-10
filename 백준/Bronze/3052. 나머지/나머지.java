import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[] array = new boolean[42];
        int count = 0;

        for(int i = 0; i < 10; i++){
            int a = scanner.nextInt();
            array[a % 42] = true; 
        }

        for(int i = 0; i < 42; i++){
            if(array[i]){
                count++;
            }
        }

        System.out.println(count);

        scanner.close(); 
    }
}
