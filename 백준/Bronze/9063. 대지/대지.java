import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int minX = 100000;
        int maxX = -100000;
        int minY = 100000;
        int maxY = -100000;

        for(int i = 0; i < n; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if(x > maxX){
                maxX = x;
            }

            if(x < minX){
                minX = x;
            }

            if(y > maxY){
                maxY = y;
            }

            if(y < minY){
                minY = y;
            }
        }

        System.out.println((maxX - minX) * (maxY-minY));

        scanner.close();
    }
}

