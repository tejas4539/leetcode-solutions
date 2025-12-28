import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                li.add(i);
            }
        }
        return li;
    }
}
