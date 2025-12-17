public class Problem1309 {
    public String freqAlphabets(String s) {
        String[] map = {
                "a", "b", "c", "d", "e", "f", "g", "h", "i",
                "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z"
        };

        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != '#') {
                int n = c - '0';
                sb.append(map[n - 1]);
            } else {
                char c2 = s.charAt(i - 1);
                char c3 = s.charAt(i - 2);
                String st = "" + c3 + c2;
                i -= 2;
                int n = Integer.parseInt(st);
                sb.append(map[n - 1]);

            }
        }

        return sb.reverse().toString();

    }
}
