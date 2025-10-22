import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        HashMap<String, Integer> map = new HashMap<>();
        Set<String>al=new HashSet<>(List.of(banned));
        String[] words = paragraph.split("[^a-zA-Z0-9]+");
        for (String word : words) {
            if (!al.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        int maxCount = Collections.max(map.values());
        String maxWord = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                maxWord = entry.getKey();
                break; // if you want just one word
            }
        }
        return maxWord;
    }
}