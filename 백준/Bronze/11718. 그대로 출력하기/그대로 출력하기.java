import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     

        for(int i = 0; i < 100; i++){
            if(scanner.hasNext()){
                String str = scanner.nextLine();
                System.out.println(str);
            }
        }
        
        scanner.close(); 
    }
}
