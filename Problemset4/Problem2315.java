package Problemset4;

public class Problem2315 {
    public int countAsterisks(String s) {
        if (!s.contains("*"))
            return 0;
        String[] words = s.split("\\|");
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                for (char c : words[i].toCharArray()) {
                    if (c == '*') {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
