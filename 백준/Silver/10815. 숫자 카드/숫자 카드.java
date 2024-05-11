import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[20000001];

        for (int i = 0; i < n; i++) {
            array[10_000_000 + scanner.nextInt()] = 1;
        }

        int m = scanner.nextInt();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < m; i++) {
            try {
                if (array[10_000_000 + scanner.nextInt()] == 1) {
                    bw.write("1 ");
                } else {
                    bw.write("0 ");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        }

        bw.close();
        scanner.close();
    }
}