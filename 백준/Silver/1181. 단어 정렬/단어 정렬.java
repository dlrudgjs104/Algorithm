import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // 길이가 다를 경우
                if (s1.length() != s2.length()) {
                    return s1.length() - s2.length();
                }
                // 길이가 같을 경우
                return s1.compareTo(s2);
            }
        });

        // 중복된 단어 제거
        for (int i = 1; i < n; i++) {
            if (words[i].equals(words[i - 1])) {
                words[i - 1] = null;
            }
        }

        // 정렬된 단어 출력
        for (String word : words) {
            if (word != null) {
                System.out.println(word);
            }
        }

        scanner.close();
    }
}
