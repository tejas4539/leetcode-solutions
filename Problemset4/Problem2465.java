package Problemset4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem2465 {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int k = nums.length - 1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int avg = nums[i] + nums[k];
            set.add(avg);
            k--;
        }

        return set.size();
    }
}
