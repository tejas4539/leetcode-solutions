package Problemset4;

public class Problem2379 {
    public int minimumRecolors(String blocks, int k) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= blocks.length() - k; i++) {
            String sub = blocks.substring(i, i + k);
            int count = 0;
            for (char c : sub.toCharArray()) {
                if (c == 'W') {
                    count++;
                }
            }
            min = Math.min(count, min);
        }
        return min;
    }
}
