public class Problem1446 {
    public int maxPower(String s) {
        if (s.length() == 1)
            return 1;
        int count = 1;
        int max = 1;
        char c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            } else {
                if (max < count) {
                    max = count;
                }
                count = 1;
                c = s.charAt(i);
            }
        }
        if (max < count)
            max = count;
        return max;
    }
}
