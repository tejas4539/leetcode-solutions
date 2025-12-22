public class Problem1592 {
    public String reorderSpaces(String text) {
        int n = text.length();
        if(n==1) return text;
        String[] words = text.trim().split("\\s+");
        int countSpaces = 0;
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') {
                countSpaces++;
            }
        }
        int m = words.length;
        int spacesBetween = (m > 1) ? countSpaces / (m - 1) : 0;
        int extraSpaces = (words.length > 1) ? countSpaces % (words.length - 1) : countSpaces;
        StringBuilder sb = new StringBuilder();

        for (int k = 0; k < m; k++) {
            sb.append(words[k]);
            if (k < m - 1) {
                sb.append(" ".repeat(spacesBetween));
            }
        }
        sb.append(" ".repeat(extraSpaces));
        return sb.toString();
    }
}
