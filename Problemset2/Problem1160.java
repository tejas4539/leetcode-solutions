

import java.util.HashMap;
import java.util.Map;

public class Problem1160 {
     public int countCharacters(String[] words, String chars) {
        int countChar = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);

        }
        for (String word : words) {
            Map<Character, Integer> map2 = new HashMap<>(map);
            boolean match = false;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (map2.containsKey(c)) {
                    if (map2.get(c) > 0) {
                        map2.put(c, map2.get(c) - 1);
                        if (i == word.length() - 1)
                            match = true;
                    } else {
                        match = false;
                        break;
                    }

                } else {
                    match = false;
                    break;
                }
            }

            if (match)
                countChar += word.length();
        }
        return countChar;
    }

}
