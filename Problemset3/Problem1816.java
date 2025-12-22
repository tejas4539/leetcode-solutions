public class Problem1816 {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        if (words.length == k)
            return s;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(words[i] + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
