import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine().trim();

        String[] strArray = str.split(" ");
        int[] intArray = new int[strArray.length];

        for(int i = 0; i < strArray.length; i++){
            String text = "";
            for(int j = strArray[i].length() - 1; j >= 0; j--){
                text += strArray[i].charAt(j);
            }

            intArray[i] = Integer.parseInt(text);
        }
        
        if(intArray[0] > intArray[1]){
            System.out.println(intArray[0]);
        }else{
            System.out.println(intArray[1]);
        }
        
        scanner.close(); 
    }
}
