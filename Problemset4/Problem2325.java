package Problemset4;

import java.util.HashMap;

public class Problem2325 {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        int i = 0;
        for (char c : key.toCharArray()) {
            if (!map.containsKey(c) && c != ' ') {
                char a = (char) ('a' + i);
                map.put(c, a);
                i++;
            }
        }
        String s = "";
        for (char c : message.toCharArray()) {
            if (c == ' ')
                s += " ";
            else
                s += map.get(c);
        }
        return s;
    }
}
