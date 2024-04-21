import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long v = scanner.nextLong();

        long day = 0;

        day = (v - a) / (a - b);

        if((v - a) % (a - b) == 0){
            day++;
        }
        else{
            day += 2;
        }

        System.out.println(day);
        
        scanner.close();
    }
}
