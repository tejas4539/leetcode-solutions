public class Problem2220 {
    public int minBitFlips(int start, int goal) {
        String s1 = Integer.toString(start, 2);
        String s2 = Integer.toString(goal, 2);
        if (s1.length() > s2.length()) {
            while (s1.length() != s2.length()) {
                s2 = "0" + s2;
            }
        }
        if (s1.length() < s2.length()) {
            while (s1.length() != s2.length()) {
                s1 = "0" + s1;
            }
        }
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
