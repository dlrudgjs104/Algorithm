import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        
        String str = scanner.nextLine();
        String[] strArray = str.split("\\s+");
        long n = Long.parseLong(strArray[0]);
        int b = Integer.parseInt(strArray[1]);
        
        String conversionStr = "";
        String conversionStr2 = "";

        while(n > 0){
            int index = (int) (n % b);
            conversionStr += array[index];
            n = (int) n / b;
        }
        
        for(int i = conversionStr.length() - 1; i >= 0; i--){
            conversionStr2 += conversionStr.substring(i, i + 1);
        }

        System.out.println(conversionStr2);

        scanner.close();
    }
}