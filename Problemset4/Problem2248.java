package Problemset4;

import java.util.ArrayList;
import java.util.List;

public class Problem2248 {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> li = new ArrayList<>();
        int[] res = new int[10001];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                res[nums[i][j]]++;
            }
        }
        for (int i = 0; i < res.length; i++) {
            if (res[i] == nums.length) {
                li.add(i);
            }
        }
        return li;
    }
}
