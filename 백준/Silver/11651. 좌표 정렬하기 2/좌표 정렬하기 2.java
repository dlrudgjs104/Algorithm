import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Point[] points = new Point[n];

        // 좌표 입력 받기
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points[i] = new Point(x, y);
        }

        // 좌표 정렬
        Arrays.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if (p1.y == p2.y) {
                    return Integer.compare(p1.x, p2.x);
                }
                return Integer.compare(p1.y, p2.y);
            }
        });

        // 정렬된 좌표 출력
        for (Point point : points) {
            System.out.println(point.x + " " + point.y);
        }

        scanner.close();
    }

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
