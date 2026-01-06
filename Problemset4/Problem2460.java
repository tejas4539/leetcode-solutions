package Problemset4;

public class Problem2460 {
    public int[] applyOperations(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                nums[i] = 0;
                nums[i - 1] = nums[i - 1] * 2;
            }
        }
        int k = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                k++;
            }
        }
        return nums;
    }
}
