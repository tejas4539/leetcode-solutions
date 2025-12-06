public class Problem1556 {
    public String thousandSeparator(int n) {
        if (n < 1000)
            return Integer.toString(n);
        String str = String.valueOf(n);
        int a = str.length() - 1;
        StringBuilder sb = new StringBuilder();
        int count = 3;
        while (a >= 0) {
            char c = str.charAt(a);
            if (count == 0) {
                sb.append(".");
                sb.append(c + "");
                count = 3;
            } else {
                sb.append(c);
            }
            count--;
            a--;
        }
        return sb.reverse().toString();
    }
}
