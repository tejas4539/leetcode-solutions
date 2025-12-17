class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        if (s.isBlank())
            return true;
        for (int k = 0; k < t.length(); k++) {
            if (j < s.length()) {
                if (s.charAt(j) == t.charAt(k)) {
                    j++;
                }
            } else {
                break;
            }
        }
        return j == s.length();
    }
}