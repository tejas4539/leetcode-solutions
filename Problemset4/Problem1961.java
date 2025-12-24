public class Problem1961 {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String str : words) {
            sb.append(str);

            if (sb.length() == s.length()) {
                return sb.toString().equals(s);
            }
            if (sb.length() > s.length()) {
                return false;
            }

        }
        if (sb.length() < s.length()) {
            return false;
        }
        return true;
    }
}
