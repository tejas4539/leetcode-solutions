package Problemset4;

import java.util.HashSet;
import java.util.Set;

public class Problem2441 {
    public int findMaxK(int[] nums) {
        int max = -1;
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        for (int n : nums) {
            if (set.contains(-n)) {
                max = Math.max(n, max);
            }
        }
        return max;
    }
}
