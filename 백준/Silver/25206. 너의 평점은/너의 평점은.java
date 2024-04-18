import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] grade = new String[20][3];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        float sum = 0;
        float avg = 0;
        float count = 0;

        try {
            for(int i = 0; i < 20; i++){
                line = reader.readLine();
                grade[i] = line.split(" ");
            }


            reader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        for(int i = 0; i < 20; i++){
            if(!grade[i][2].equals("P") ){
                count += Float.parseFloat(grade[i][1]);

                if(grade[i][2].equals("A+")){
                    avg += 4.5 * Float.parseFloat(grade[i][1]);
                }
                else if(grade[i][2].equals("A0")){
                    avg += 4.0 * Float.parseFloat(grade[i][1]);
                }
                else if(grade[i][2].equals("B+")){
                    avg += 3.5 * Float.parseFloat(grade[i][1]);
                }
                else if(grade[i][2].equals("B0")){
                    avg += 3.0 * Float.parseFloat(grade[i][1]);
                }
                else if(grade[i][2].equals("C+")){
                    avg += 2.5 * Float.parseFloat(grade[i][1]);
                }
                else if(grade[i][2].equals("C0")){
                    avg += 2.0 * Float.parseFloat(grade[i][1]);
                }
                else if(grade[i][2].equals("D+")){
                    avg += 1.5 * Float.parseFloat(grade[i][1]);
                }
                else if(grade[i][2].equals("D0")){
                    avg += 1.0 * Float.parseFloat(grade[i][1]);
                }
                else{
                    avg += 0.0;
                }   
            }
        }

        avg /= count;

        System.out.println(avg);
    }
}

