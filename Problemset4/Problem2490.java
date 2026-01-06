package Problemset4;

public class Problem2490 {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        int n = words.length;
        if (sentence.charAt(0) != sentence.charAt(sentence.length() - 1)) {
            return false;
        }
        for (int i = 1; i < n; i++) {
            if (words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1)) {
                return false;
            }
        }
        return true;
    }
}
