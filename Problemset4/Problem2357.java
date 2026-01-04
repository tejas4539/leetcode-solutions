package Problemset4;

public class Problem2357 {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        if (n == 1 && nums[0] == 0)
            return 0;
        if (n == 1)
            return 1;
        int[] res = new int[101];
        for (int a : nums) {
            res[a]++;
        }
        int count = 0;
        for (int i = 1; i < res.length; i++) {
            if (res[i] != 0) {
                count++;
            }
        }
        return count;
    }
}
