import java.util.HashMap;
import java.util.Map;

public class Problem1624 {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, Integer> first = new HashMap<>();
        HashMap<Character, Integer> last = new HashMap<>();
        int currentDist = 0;
        int maxDist = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!first.containsKey(c)) {
                first.put(c, i);
            } else {
                last.put(c, i);
            }
        }
        if (last.isEmpty()) {
            return -1;
        }
        for (Map.Entry<Character, Integer> entry : last.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            if (first.containsKey(key)) {
                currentDist = value - first.get(key);
            }
            maxDist = Math.max(currentDist, maxDist);
        }
        return maxDist - 1;
    }
}
