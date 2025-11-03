import java.util.HashMap;

public class Problem961 {
     public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if(map.containsKey(n)) return n;
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        return 0;
    }
}
