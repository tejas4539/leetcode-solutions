import java.util.ArrayList;
import java.util.List;

public class Problem1018 {

      public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> li = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num = ((num * 2) + nums[i])%5;
            if (num == 0)
                li.add(true);
            else
                li.add(false);
        }
        return li;

    }
}