import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Problem1002 {
    public List<String> commonChars(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : words[0].toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 1; i < words.length; i++) {
            HashMap<Character, Integer> map2 = new HashMap<>();
            for (char c : words[i].toCharArray()) {
                map2.put(c, map2.getOrDefault(c, 0) + 1);

            }
            for (char c : new HashSet<>(map.keySet())) {
                if (map2.containsKey(c)) {
                    map.put(c, Math.min(map.get(c), map2.get(c)));
                } else {
                    map.remove(c); // remove if not common
                }
            }
        }
        List<String> li = new ArrayList<>();
        for (Character c : map.keySet()) {
            String str = String.valueOf(c);
            int x = map.get(c);
            for (int i = 0; i < x; i++) {
                li.add(str);
            }
        }
        return li;
    }
}
