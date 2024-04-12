import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 1, 2, 2, 2, 8};

        for(int i = 0; i < array.length; i++){
            int a = array[i] - scanner.nextInt();
            System.out.printf("%d ", a);
        }
    }
}
