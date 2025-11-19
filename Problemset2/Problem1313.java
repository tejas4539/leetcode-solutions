import java.util.ArrayList;
import java.util.List;

public class Problem1313 {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        int i = 0;
        while (i < n) {
            int freq = nums[i];
            int val = nums[i + 1];
            for (int k = 0; k < freq; k++) {
                res.add(val);
            }
            i += 2;
        }
        return res.stream().mapToInt(m -> m).toArray();
    }
}
