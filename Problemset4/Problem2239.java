package Problemset4;

public class Problem2239 {
    public int findClosestNumber(int[] nums) {
        int closer = Integer.MAX_VALUE;

        for (int n : nums) {
            int res = Math.abs(n - 0);
            if (res == Math.abs(closer) && n >= Math.abs(closer)) {
                closer = n;
            }
            if (res < Math.abs(closer)) {
                closer = n;
            }
        }
        return closer;

    }

}
