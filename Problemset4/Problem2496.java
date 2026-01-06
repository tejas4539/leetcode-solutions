package Problemset4;

public class Problem2496 {
    public int maximumValue(String[] strs) {
        int max = 0;
        for (String s : strs) {
            int n = 0;
            boolean notNumber = false;
            for (char c : s.toCharArray()) {
                if (!Character.isDigit(c)) {
                    notNumber = true;
                    break;
                }
            }
            if (notNumber) {
                n = s.length();
            } else {
                n = Integer.parseInt(s);
            }

            if (n > max) {
                max = n;
            }
        }
        return max;
    }

}