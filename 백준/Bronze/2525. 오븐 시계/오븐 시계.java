import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int cookTime = scanner.nextInt();

        int cookTimeH = cookTime / 60;
        int cookTimeM = cookTime % 60;

        if ((h + cookTimeH) >= 23 && (m + cookTimeM) >= 60){
            System.out.println((h + cookTimeH - 24 + 1) + " " + (m + cookTimeM - 60));
        }
        else if(h + cookTimeH >= 24){
            System.out.println((h + cookTimeH - 24) + " " + (m + cookTimeM));
        }
        else if ((m + cookTimeM) >= 60){
            System.out.println((h + cookTimeH + 1) + " " + (m + cookTimeM - 60));
        }
        else{
            System.out.println((h + cookTimeH) + " " + (m + cookTimeM));
        }
    }
}