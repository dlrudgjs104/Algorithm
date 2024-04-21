import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int n = scanner.nextInt();

        long[] utp = new long[k];
        long maxUtp = 0;

        for(int i = 0; i < k; i++){
            utp[i] = scanner.nextLong();
            maxUtp = Math.max(maxUtp, utp[i]); // 최대 길이 찾기
        }

        long start = 1;
        long end = maxUtp;
        long maxLength = 0;

        while(start <= end){
            long mid = (start + end) / 2;
            long count = 0;

            for(int i = 0; i < k; i++){
                count += utp[i] / mid;
            }

            if(count >= n){
                maxLength = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(maxLength);

        scanner.close();
    }
}
