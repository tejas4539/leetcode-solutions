package Problemset4;

public class Problem2351 {
    public char repeatedCharacter(String s) {
        int[] res = new int[26];
        for (char c : s.toCharArray()) {
            if (res[c - 'a'] == 0) {
                res[c - 'a']++;
            } else {
                return c;
            }
        }
        return 'a';
    }
}
