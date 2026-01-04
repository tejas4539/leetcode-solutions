package Problemset4;

import java.util.Arrays;

public class Problem2389 {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] res = new int[queries.length];
        Arrays.sort(nums);
        for (int i = 0; i < queries.length; i++) {
            int sum = 0;
            int prev = 0;
            for (int j = 0; j < nums.length; j++) {
                if (sum + nums[j] > queries[i]) {
                    break;
                }
                sum += nums[j];
                prev++;
            }
            res[i] = prev;

        }
        return res;
    }
}
