import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        
        String text = "abcdefghijklmnopqrstuvwxyz";

        int[] array = new int[text.length()];

        for(int i = 0; i < array.length; i++){
            array[i] = -1;
        }

        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < text.length(); j++){
                if(text.charAt(j) == s.charAt(i) && array[j] == -1){
                    array[j] = i;
                }
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.printf("%d ", array[i]);
        }
        
        scanner.close(); 
    }
}
