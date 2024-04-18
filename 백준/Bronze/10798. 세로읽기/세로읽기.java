import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strArray = new String[5];
        int maxLength = 0;

        for(int i = 0; i < 5; i++){
            strArray[i] = scanner.nextLine();
            if(strArray[i].length() > maxLength){
                maxLength = strArray[i].length();
            }
        }

        char[][] charArray = new char[5][maxLength];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < strArray[i].length(); j++){
                charArray[i][j] = strArray[i].charAt(j);
            }
        }

        for(int i = 0; i < maxLength; i++){
            for(int j = 0; j < 5; j++){
                // char형 변수값이 비어있일 때 값 '\u0000' 
                if(charArray[j][i] != '\u0000'){
                    System.out.printf("%c", charArray[j][i]);
                }
            }
        }
        
    }
}

