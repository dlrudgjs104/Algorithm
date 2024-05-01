import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;
        int creator = 0;

        for (int i = 0; i < n; i++) {
            count++;
            String countStr = String.valueOf(count);
            int countLen = countStr.length();
            String[] digit = new String[countLen];

            for (int j = 0; j < countLen; j++) {
                digit[j] = countStr.substring(j, j + 1);
            }

            int sum = count;
            for (int j = 0; j < countLen; j++) {
                sum += Integer.parseInt(digit[j]);
            }

            if (sum == n) {
                creator = count;
                break;
            }
        }

        System.out.println(creator);

        scanner.close();
    }
}
