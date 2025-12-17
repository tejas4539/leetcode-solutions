public class Problem1413 {
    public int minStartValue(int[] nums) {
        int minSum = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            minSum = Math.min(sum, minSum);
        }
        return Math.abs(minSum) + 1;
    }
}
