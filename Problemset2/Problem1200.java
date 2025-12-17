

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1200 {
     public List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int dist = arr[i + 1] - arr[i];
            min = Math.min(dist, min);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            List<Integer> li = new ArrayList<>();
            if (arr[i + 1] - arr[i] == min) {
                li.add(arr[i]);
                li.add(arr[i + 1]);
                list.add(li);
            }

        }
        return list;
    }
}
