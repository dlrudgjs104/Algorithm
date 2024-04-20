import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        
        String str = scanner.nextLine();
        String[] strArray = str.split("\\s+");
        String b = strArray[0];
        int n = Integer.parseInt(strArray[1]);
        long sum = 0;

        for(int i = b.length() - 1; i >= 0 ; i--){
            for(int j = 0; j < n; j++){
                if(b.substring(i, i + 1).equals(array[j])){
                    sum += (int) (Math.pow(n, b.length() - 1 - i) * j);
                }
            }
        }

        System.out.println(sum);

        scanner.close();
    }
}