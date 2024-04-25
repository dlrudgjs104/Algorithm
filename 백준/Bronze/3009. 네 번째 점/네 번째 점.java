import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] array = new int[4][2];
        int resultX;
        int resultY;

/*
x1 count
y1 count
x2 count
y2 count
*/

        for (int i = 0; i < 3; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if(i == 0){
                array[0][0] = x;
                array[1][0] = y;
                array[0][1]++;
                array[1][1]++;
            }
            else{
                if(array[0][0] != x){
                    array[2][0] = x;
                    array[2][1]++;
                }
                else{
                    array[0][1]++;
                }
    
                if(array[1][0] != y){
                    array[3][0] = y;
                    array[3][1]++;
                }
                else{
                    array[1][1]++;
                }
            }
            
        }

        if(array[0][1] == 1){
            resultX = array[0][0];
        }
        else{
            resultX = array[2][0];
        }

        if(array[1][1] == 1){
            resultY = array[1][0];
        }
        else{
            resultY = array[3][0];
        }

        System.out.println(resultX + " " + resultY);

        scanner.close();
    }
}
