package Problemset4;

import java.util.Arrays;

public class Problem1913 {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int prod1 = nums[n - 1] * nums[n - 2];
        int prod2 = nums[0] * nums[1];
        return prod1 - prod2;
    }
}
