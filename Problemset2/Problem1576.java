public class Problem1576 {
    public String modifyString(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(s);
        int n = s.length();
        if (n == 1) {
            if (s.charAt(0) == '?') {
                return "a";
            }
        }
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '?') {
                if (i == 0 || i == n - 1) {
                    if (i == 0 && i < n) {
                        char c2 = sb2.charAt(i + 1);
                        char other;
                        do {
                            other = (char) ('a' + (int) (Math.random() * 26));
                        } while (other == c2);
                        sb.append(other);
                        sb2.setCharAt(i, other);

                    } else {
                        char c2 = sb2.charAt(i - 1);
                        char other;
                        do {
                            other = (char) ('a' + (int) (Math.random() * 26));
                        } while (other == c2);
                        sb.append(other);
                        sb2.setCharAt(i, other);
                    }
                } else {
                    char c1 = sb2.charAt(i - 1);
                    char c2 = sb2.charAt(i + 1);
                    char other;
                    do {
                        other = (char) ('a' + (int) (Math.random() * 26)); // random a-z
                    } while (other == c1 || other == c2);
                    sb.append(other);
                    sb2.setCharAt(i, other);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
