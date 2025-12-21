
import java.util.HashMap;

public class Problem1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2))
            return true;
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s1.length(); i++) {
            char ch = s2.charAt(i);
            String c = Character.toString(ch);
            if (map.containsKey(ch) && map.get(ch) >= 1) {
                int a = map.get(ch);
                map.put(ch, a - 1);
            } else {
                return false;
            }
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
        }
        return count == 2;
    }

}