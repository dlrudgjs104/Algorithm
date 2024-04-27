import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[3];

        int sum = 0;
        int max = 0;

        for (int i = 0; i < 3; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            sum += array[i];
        }

        if (array[0] == array[1] && array[1] == array[2]) {
            System.out.println(sum);
        } else {
            sum -= max;

            if(max >= sum){
                sum = 2 * sum - 1;
            }
            else{
                sum += max;
            }

            System.out.println(sum);
        }

        scanner.close();
    }
}