package Problemset4;

import java.util.HashMap;
import java.util.Map;

public class Problem2404 {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (n % 2 == 0) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }
        }
        if (map.size() == 0)
            return -1;
        int maxFreq = 0;
        int maxElem = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= maxFreq) {
                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    maxElem = entry.getKey();
                } else if (maxFreq == entry.getValue() && entry.getKey() < maxElem) {
                    maxFreq = entry.getValue();
                    maxElem = entry.getKey();
                }

            }
        }
        return maxElem;
    }
}
