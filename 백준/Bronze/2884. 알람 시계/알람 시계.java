import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        if (h < 1 && m < 45){
            System.out.println((h + 24 - 1) + " " + (m + 60 - 45));
        }
        else if (m < 45){
            System.out.println((h - 1) + " " + (m + 60 - 45));
        }
        else{
            System.out.println(h + " " + (m - 45));
        }
    }
}