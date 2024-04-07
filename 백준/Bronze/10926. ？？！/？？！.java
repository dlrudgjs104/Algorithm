import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String id;
            id = scanner.nextLine();
            
            System.out.println(id + "??!");

            scanner.close();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}