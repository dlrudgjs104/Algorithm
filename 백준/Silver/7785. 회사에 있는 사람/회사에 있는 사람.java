import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력받을 로그의 수
        int n = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 소비

        // 현재 회사에 있는 사람을 저장할 Set
        Set<String> inCompany = new HashSet<>();

        // 로그 처리
        for (int i = 0; i < n; i++) {
            String[] log = scanner.nextLine().split(" ");
            String name = log[0];
            String action = log[1];

            if (action.equals("enter")) {
                inCompany.add(name);
            } else if (action.equals("leave")) {
                inCompany.remove(name);
            }
        }

        // 현재 회사에 있는 사람들을 역순으로 정렬
        List<String> people = new ArrayList<>(inCompany);
        Collections.sort(people, Collections.reverseOrder());

        // 결과 출력
        for (String person : people) {
            System.out.println(person);
        }

        scanner.close();
    }
}
