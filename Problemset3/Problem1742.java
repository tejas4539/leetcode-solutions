import java.util.Collections;
import java.util.HashMap;

public class Problem1742 {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; i++) {
            String s = String.valueOf(i);
            int sum = 0;
            for (int k = 0; k < s.length(); k++) {
                sum += s.charAt(k) - '0';
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return Collections.max(map.values());
    }
}
