import java.util.Arrays;
import java.util.HashMap;

public class Problem2099 {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[] copy = nums.clone();
        Arrays.sort(copy);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = n - k; i < n; i++) {
            map.put(copy[i], map.getOrDefault(copy[i], 0) + 1);
        }
        int res[] = new int[k];
        int j = 0;
        for (int n1 : nums) {
            if (map.containsKey(n1) && map.get(n1) > 0) {
                res[j++] = n1;
                map.put(n1, map.get(n1) - 1);
            }
        }
        return res;

    }
}
