import java.util.Arrays;

public class Problem1984 {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        if (n == 1)
            return 0;
        for (int i = 0; i < n - k + 1; i++) {
            int diff = nums[i + k - 1] - nums[i];
            min = Math.min(diff, min);
        }
        return min;
    }
}
