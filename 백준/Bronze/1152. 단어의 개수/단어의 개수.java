import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine().trim();

        if(str.isEmpty()){
            System.out.println(0);
            return;
        }

        String[] strArray = str.split(" ");

        System.out.println(strArray.length);
        
        scanner.close(); 
    }
}
