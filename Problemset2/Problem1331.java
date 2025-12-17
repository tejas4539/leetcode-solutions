import java.util.Arrays;
import java.util.HashMap;

public class Problem1331 {
    public int[] arrayRankTransform(int[] arr) {
        int[] newArr = arr.clone();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[arr.length];
        Arrays.sort(newArr);
        int j = 1;
        for (int i : newArr) {
            if (!map.containsKey(i)) {
                map.put(i, j);
                j++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            res[i] = map.get(arr[i]);
        }
        return res;
    }
}
