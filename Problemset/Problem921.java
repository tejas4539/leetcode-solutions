public class Problem921 {
    public int minAddToMakeValid(String s) {
        char[] ch = s.toCharArray();
        int open = 0;
        int close = 0;
        for (char c : ch) {
            if (c == '(') {
                open++;
            } else if (c == ')') {
                if (open > 0) {
                    open--;
                } else {
                    close++;
                }
            }
        }
        return close + open;
    }
}
