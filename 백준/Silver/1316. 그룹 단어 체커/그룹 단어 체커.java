import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            char beforeText = str.charAt(0);

            if (str.length() == 1) {
                count++;
            } 
            else {
                // 이전 문자와 연속인지 검사
                for (int j = 1; j < str.length(); j++) {
                    if (beforeText == str.charAt(j)) {

                    } else {
                        boolean continual = false;

                        // 앞에 나왔던 문자가 나왔는지 검사
                        for (int k = 0; k < j - 1; k++) {
                            if (str.charAt(j) == str.charAt(k)) {
                                continual = true;
                                break;
                            }
                        }

                        if (continual) {
                            break;
                        }

                        beforeText = str.charAt(j);
                    }

                    if (j == str.length() - 1) {
                        count++;
                    }

                }
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
