public class Problem1827 {
    public int minOperations(int[] nums) {
        int count = 0;
        int diff;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                diff = nums[i - 1] - nums[i];
                count += diff + 1;
                nums[i] = nums[i] + diff + 1;
            }
        }
        return count;
    }
}
