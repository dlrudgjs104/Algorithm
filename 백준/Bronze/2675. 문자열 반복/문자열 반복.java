import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
        for(int i = 0; i < n; i++){
            int count = scanner.nextInt();
            String s = scanner.nextLine().trim();
            String text = "";

            for(int j = 0; j < s.length(); j++){
                for(int k = 0; k < count; k++){
                    text += s.charAt(j);
                }
            }
            
            System.out.println(text);
        }
        
        scanner.close(); 
    }
}
