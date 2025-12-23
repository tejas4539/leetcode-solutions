package Problemset4;

public class Problem1869 {
    public boolean checkZeroOnes(String s) {
        int count1 = 0;
        int count0 = 0;
        int max1 = 0;
        int max0 = 0;
        int n = s.length();
        if (n == 1)
            return s.charAt(0) == '1';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                max1 = Math.max(count1, max1);
                count1++;
                count0 = 0;
            } else {
                max0 = Math.max(count0, max0);
                count0++;
                count1 = 0;
            }
        }
        return max1 > max0;
    }
}
