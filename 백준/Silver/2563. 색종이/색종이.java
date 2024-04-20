import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] paper = new int[100][100];
        int count = 0;

        for(int i = 0; i < n; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();   
            
            for(int yPosition = y; yPosition < y + 10  ; yPosition++){
                for(int xPosition = x; xPosition < x + 10; xPosition++){
                    paper[yPosition][xPosition] = 1;
                }
            }
        }

        for(int yPosition = 0; yPosition < 100; yPosition++){
            for(int xPosition = 0; xPosition < 100; xPosition++){
                if(paper[yPosition][xPosition] == 1){
                    count++;
                }
            }
        }

        System.out.println(count);
        
        scanner.close();
    }
}