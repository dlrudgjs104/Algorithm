import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int[] count = new int[26];

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'A') {
                count[0]++;
            } else if (text.charAt(i) == 'b' || text.charAt(i) == 'B') {
                count[1]++;
            } else if (text.charAt(i) == 'c' || text.charAt(i) == 'C') {
                count[2]++;
            } else if (text.charAt(i) == 'd' || text.charAt(i) == 'D') {
                count[3]++;
            } else if (text.charAt(i) == 'e' || text.charAt(i) == 'E') {
                count[4]++;
            } else if (text.charAt(i) == 'f' || text.charAt(i) == 'F') {
                count[5]++;
            } else if (text.charAt(i) == 'g' || text.charAt(i) == 'G') {
                count[6]++;
            } else if (text.charAt(i) == 'h' || text.charAt(i) == 'H') {
                count[7]++;
            } else if (text.charAt(i) == 'i' || text.charAt(i) == 'I') {
                count[8]++;
            } else if (text.charAt(i) == 'j' || text.charAt(i) == 'J') {
                count[9]++;
            } else if (text.charAt(i) == 'k' || text.charAt(i) == 'K') {
                count[10]++;
            } else if (text.charAt(i) == 'l' || text.charAt(i) == 'L') {
                count[11]++;
            } else if (text.charAt(i) == 'm' || text.charAt(i) == 'M') {
                count[12]++;
            } else if (text.charAt(i) == 'n' || text.charAt(i) == 'N') {
                count[13]++;
            } else if (text.charAt(i) == 'o' || text.charAt(i) == 'O') {
                count[14]++;
            } else if (text.charAt(i) == 'p' || text.charAt(i) == 'P') {
                count[15]++;
            } else if (text.charAt(i) == 'q' || text.charAt(i) == 'Q') {
                count[16]++;
            } else if (text.charAt(i) == 'r' || text.charAt(i) == 'R') {
                count[17]++;
            } else if (text.charAt(i) == 's' || text.charAt(i) == 'S') {
                count[18]++;
            } else if (text.charAt(i) == 't' || text.charAt(i) == 'T') {
                count[19]++;
            } else if (text.charAt(i) == 'u' || text.charAt(i) == 'U') {
                count[20]++;
            } else if (text.charAt(i) == 'v' || text.charAt(i) == 'V') {
                count[21]++;
            } else if (text.charAt(i) == 'w' || text.charAt(i) == 'W') {
                count[22]++;
            } else if (text.charAt(i) == 'x' || text.charAt(i) == 'X') {
                count[23]++;
            } else if (text.charAt(i) == 'y' || text.charAt(i) == 'Y') {
                count[24]++;
            } else if (text.charAt(i) == 'z' || text.charAt(i) == 'Z') {
                count[25]++;
            }
        }

        int max = 0;
        int maxIndex = 0;
        boolean duplicate = false;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                maxIndex = i;
                duplicate = false;
            } else if (count[i] == max) {
                duplicate = true;
            }
        }

        if (duplicate) {
            System.out.println("?");
        } else {
            System.out.println("ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(maxIndex));
        }
    }
}