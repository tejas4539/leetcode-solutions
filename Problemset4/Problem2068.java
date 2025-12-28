public class Problem2068 {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (char c : word1.toCharArray()) {
            int index = c - 'a';
            freq1[index]++;
        }

        for (char c : word2.toCharArray()) {
            int index = c - 'a';
            freq2[index]++;
        }

        for (int i = 0; i < freq1.length; i++) {
            if (Math.abs(freq1[i] - freq2[i]) > 3) {
                return false;
            }
        }
        return true;
    }
}
