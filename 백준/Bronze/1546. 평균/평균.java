import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        float max = 0;
        float[] score = new float[n];
        float avg = 0;

        for(int i = 0; i < n; i++){
            score[i] = scanner.nextInt();
            if(score[i] > max){
                max = score[i];
            }
        }

        for(int i = 0; i < n; i++){
            score[i] = score[i] / max * 100;
            avg += score[i];
        }

        System.out.println(avg / n);

        scanner.close(); 
    }
}
