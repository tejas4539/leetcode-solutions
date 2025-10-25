class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        ArrayList<String> al = new ArrayList<>();
        for (String word : words1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String word : words2) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                al.add(entry.getKey());
            }
        }
        return al.toArray(new String[0]);
    }
}