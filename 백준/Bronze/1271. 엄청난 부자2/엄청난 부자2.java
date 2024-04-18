import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal m = scanner.nextBigDecimal();
        BigDecimal n = scanner.nextBigDecimal();
        
        System.out.println(m.divide(n, RoundingMode.DOWN));
        System.out.println(m.remainder(n));

        scanner.close();
    }
}