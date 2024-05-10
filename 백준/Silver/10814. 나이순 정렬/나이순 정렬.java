import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        Member[] members = new Member[n];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            members[i] = new Member(Integer.parseInt(input[0]), input[1]);
        }

        Arrays.sort(members);

        // 정렬된 단어 출력
        for (Member member : members) {
            System.out.println(member);
        }

        scanner.close();
    }
}

class Member implements Comparable<Member> {
    int age;
    int num = 0;
    String name;

    Member(int age, String name) {
        this.age = age;
        num++;
        this.name = name;
    }

    @Override
    public int compareTo(Member other) {
        if (this.age != other.age) {
            return this.age - other.age;
        }
        return this.num - other.num;
    }

    @Override
    public String toString() {
        return this.age + " " + this.name;
    }
}