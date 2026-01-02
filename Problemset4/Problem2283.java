package Problemset4;

import java.util.HashMap;

public class Problem2283 {
    public boolean digitCount(String num) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : num.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < num.length(); i++) {
            int c = num.charAt(i) - '0';
            char s = (char) (i + '0');
            int a = map.getOrDefault(s, 0);
            if (a != c) {
                return false;
            }
        }
        return true;
    }
}
