package Problemset4;

public class Problem1844 {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 1; i < s.length(); i += 2) {
            char ch = s.charAt(i - 1);
            int num = s.charAt(i) - '0';
            char c = (char) (ch + num);
            sb.setCharAt(i, c);
        }
        return sb.toString();

    }
}
