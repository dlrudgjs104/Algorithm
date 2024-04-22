import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        int sum = 0;
        int i = 0;

        while(sum < x){
            i++;
            sum += i;
        }
        sum -= i;

        if(i % 2 == 0){
            System.out.println((x - sum) + "/" + (i - (x - sum) + 1));
        }else{
            System.out.println((i - (x - sum) + 1) + "/" + (x - sum));
        }

        scanner.close();
    }
}
