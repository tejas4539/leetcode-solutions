public class Problem2016 {
    public int maximumDifference(int[] nums) {
        int diff = 0;
        int maxDiff = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    diff = nums[j] - nums[i];
                    maxDiff = Math.max(diff, maxDiff);
                }
            }
        }
        if (maxDiff == 0)
            return -1;
        return maxDiff;
    }
}
