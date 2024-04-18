import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] array = new int[9][9];
        int max = 0;
        int indexRow = 0;
        int indexCol = 0;

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                array[i][j] = scanner.nextInt();

                if(array[i][j] > max){
                    max = array[i][j];
                    indexRow = i;
                    indexCol = j;
                }
            }   
        }

        System.out.println(max);
        System.out.printf("%d %d", indexRow + 1, indexCol + 1);

        scanner.close();
    }
}
