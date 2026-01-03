package Problemset4;

public class Problem2309 {
    public String greatestLetter(String s) {
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lower[c - 'a'] = true;
            } else {
                upper[c - 'A'] = true;
            }
        }
        char a = 'a';
        for (int i = 0; i < lower.length; i++) {
            if (lower[i] && upper[i]) {
                a = (char) ('A' + i);
            }
        }
        if (a == 'a')
            return "";
        return String.valueOf(a);
    }
}
