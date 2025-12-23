package Problemset4;

public class Problem1859 {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] a = new String[words.length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            char c = words[i].charAt(words[i].length() - 1);
            int num = c - '0';
            String s2 = words[i].substring(0, words[i].length() - 1);
            a[num - 1] = s2;
        }
        for (int i = 0; i < a.length; i++) {
            if (i != 0)
                sb.append(" ");
            sb.append(a[i]);
        }
        return sb.toString();
    }
}
