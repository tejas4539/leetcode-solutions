package Problemset4;

public class Problem1876 {
    public int countGoodSubstrings(String s) {
        int j = 1;
        int k = 2;
        int count = 0;
        char c1;
        char c2;
        char c3;
        for (int i = 0; i < s.length() - 2; i++) {
            c1 = s.charAt(i);
            c2 = s.charAt(j);
            c3 = s.charAt(k);
            if (c1 != c2 && c2 != c3 && c3 != c1) {
                count++;
            }
            j++;
            k++;
        }
        return count;
    }
}
