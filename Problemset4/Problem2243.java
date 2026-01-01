package Problemset4;

public class Problem2243 {

    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() > k) {
            int j = 0;
            sb.setLength(0);
            String s1 = "";
            for (int i = 0; i < s.length(); i++) {
                s1 += s.charAt(i);
                j++;
                if (j == k) {
                    j = 0;
                    int a = s1.charAt(0) - '0';
                    for (int l = 1; l < s1.length(); l++) {
                        a += s1.charAt(l) - '0';
                    }
                    sb.append(String.valueOf(a));
                    s1 = "";
                }
            }
            if (!s1.isEmpty()) {
                int a = s1.charAt(0) - '0';
                for (int m = 1; m < s1.length(); m++) {
                    a += s1.charAt(m) - '0';
                }
                sb.append(String.valueOf(a));
            }
            s = sb.toString();
        }
        return sb.toString();
    }
}