package Problemset4;

import java.util.HashMap;

public class Problem1941 {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int a = map.get(s.charAt(0));

        for (int val : map.values()) {
            if (a != val) {
                return false;
            }
        }
        return true;
    }
}
