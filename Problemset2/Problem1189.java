package Problemset2;

import java.util.HashMap;
import java.util.Map;

public class Problem1189 {
    class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = 0;
        boolean lo = true;
        while (lo) {

            if (map.containsKey('a') && map.containsKey('b')
                    && map.containsKey('o') && map.containsKey('n')
                    && map.containsKey('l')) {
                int a = map.get('a');
                int b = map.get('b');
                int l = map.get('l');
                int o = map.get('o');
                int n = map.get('n');
                if (a > 0 && b > 0 && l > 1 && o > 1
                        && n > 0) {
                    count++;
                    map.put('a', a - 1);
                    map.put('b', b - 1);
                    map.put('l', l - 2);
                    map.put('o', o - 2);
                    map.put('n', n - 1);
                } else {
                    lo = false;
                }

            } else {
                lo = false;
                return count;
            }

        }
        return count;
    }
}
}
