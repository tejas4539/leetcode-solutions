public class Problem2148 {
    public int countElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            min = Math.min(n, min);
            max = Math.max(n, max);
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > min && nums[i] < max) {
                count++;
            }
        }
        return count;
    }
}
