import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     

        String str = scanner.nextLine();
        int time = 0;

        for(int i = 0; i < str.length(); i ++){
            int condition = str.charAt(i);

            if(condition >= 65 && condition <= 67){
                time += 3;
            } else if(condition >= 68 && condition <= 70){
                time += 4;
            }else if(condition >= 71 && condition <= 73){
                time += 5;
            }else if(condition >= 74 && condition <= 76){
                time += 6;
            } else if(condition >= 77 && condition <= 79){
                time += 7;
            }else if(condition >= 80 && condition <= 83){
                time += 8;
            }else if(condition >= 84 && condition <= 86){
                time += 9;
            }else if(condition >= 87 && condition <= 90){
                time += 10;
            }else{
                time += 11;
            }
        }
        
        System.out.println(time);

        scanner.close(); 
    }
}
