public class Problem1974 {
    public int minTimeToType(String word) {
        int count = word.length();
        int first = Math.abs(word.charAt(0) - 'a');
        count += Math.min(first, 26 - first);
        for (int i = 1; i < word.length(); i++) {
            char c1 = word.charAt(i - 1);
            char c2 = word.charAt(i);
            int d1 = c1 - 'a';
            int d2 = c2 - 'a';
            int clock = Math.abs(d1 - d2);
            int anti = 26 - clock;
            count += Math.min(clock, anti);

        }
        return count;
    }
}
