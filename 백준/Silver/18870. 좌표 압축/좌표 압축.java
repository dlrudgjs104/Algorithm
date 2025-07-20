import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] array = new int[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            
            array[i] = s.nextInt();
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            map.put(array[i], 0);
        }

        int index = 0;

        for(Integer key : map.keySet()) {
            map.put(key, index++);
        }

        for (int i = 0; i < n; i++) {
            result[i] = map.get(array[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (int r : result) {
            sb.append(r).append(" ");
        }
        System.out.println(sb);
        
    }
}
