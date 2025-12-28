import java.util.ArrayList;
import java.util.HashMap;

public class Problem2094 {
    public int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int n : digits) {
            map1.put(n, map1.getOrDefault(n, 0) + 1);
        }
        for (int i = 100; i < 999; i++) {
            if (i % 2 == 0) {
                HashMap<Integer, Integer> map2 = new HashMap<>();
                map2.putAll(map1);
                boolean a = true;
                int temp = i;
                while (temp != 0) {
                    int res = temp % 10;
                    if (!map2.containsKey(res) || map2.get(res) < 1) {
                        a = false;
                        break;
                    }
                    map2.put(res, map2.get(res) - 1);
                    temp = temp / 10;
                }

                if (a)
                    list.add(i);
            }

        }
        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;

    }
}
