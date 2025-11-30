import java.util.ArrayList;
import java.util.List;

public class Problem1389 {
    public int[] createTargetArray(int[] nums, int[] index) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            int pos = index[i];
            int val = nums[i];
            list.add(pos, val);
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;

    }
}
