import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        Map<String, Integer> cards = new HashMap<>();
        String[] cardList = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            if (cards.get(cardList[i]) != null) {
                cards.put(cardList[i], cards.get(cardList[i]) + 1);
            } else {
                cards.put(cardList[i], 1);
            }
        }

        int m = scanner.nextInt();
        scanner.nextLine();

        String[] questionCardList = scanner.nextLine().split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if (cards.containsKey(questionCardList[i]))  {
                result.append(cards.get(questionCardList[i])).append(" ");
            } else {
                result.append("0 ");
            }
        }

        System.out.println(result);

        scanner.close();
    }

}
