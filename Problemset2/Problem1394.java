import java.util.HashMap;
import java.util.Map;

public class Problem1394 {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int largest = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals(entry.getValue()) && entry.getKey() > largest) {
                largest = entry.getKey();
            }
        }
        if (largest == 0)
            return -1;
        return largest;
    }
}
