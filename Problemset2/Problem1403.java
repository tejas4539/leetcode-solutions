import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1403 {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
        }
        int i = nums.length - 1;
        int ad = 0;
        while (i >= 0) {
            sum -= nums[i];
            ad += nums[i];
            list.add(nums[i]);
            if (ad > sum) {
                break;
            }
            i--;

        }
        return list;
    }
}
