import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int angleSum = 0;
        int[] angle = new int[3];

        for(int i = 0; i < 3; i++){
            angle[i] = scanner.nextInt();
            angleSum += angle[i];
        }

        if(angle[0] == 60 && angle[0] == angle[1] && angle[1] == angle[2]){
            System.out.println("Equilateral");
        }
        else if(angleSum == 180 && ((angle[0] == angle[1]) || (angle[1] == angle[2]) || (angle[2] == angle[0]))){
            System.out.println("Isosceles");
        }
        else if(angleSum == 180 && angle[0] != angle[1] && angle[1] != angle[2] && angle[2] != angle[0]){
            System.out.println("Scalene");
        }
        else if(angleSum != 180){
            System.out.println("Error");
        }

        scanner.close();
    }
}

