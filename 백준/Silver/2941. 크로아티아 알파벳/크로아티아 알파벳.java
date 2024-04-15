import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String[] array = { "c=", "c-", "d-", "lj", "nj", "s=", "z=", "dz=" };

        int nowIndex = 0;
        int count = 0;
        boolean check = false;

        while (nowIndex < text.length()) {
            if (text.length() - nowIndex >= 3) {
                for (int i = 0; i < array.length; i++) {
                    check = false;
                    if (text.substring(nowIndex, nowIndex + array[i].length()).equals(array[i]) && text.length() - nowIndex >= 2) {
                        count++;
                        nowIndex += array[i].length();
                        check = true;
                        break;
                    }
                }

                if (!check) {
                    count++;
                    nowIndex++;
                }
            } else if (text.length() - nowIndex == 2) {
                for (int i = 0; i < array.length - 1; i++) {
                    check = false;
                    if (text.substring(nowIndex, nowIndex + array[i].length()).equals(array[i]) && text.length() - nowIndex >= 2) {
                        count++;
                        nowIndex += array[i].length();
                        check = true;
                        break;
                    }
                }

                if (!check) {
                    count++;
                    nowIndex++;
                }
            } else {
                count++;
                nowIndex++;
            }
        }
        System.out.println(count);
    }
}