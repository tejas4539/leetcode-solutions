package Problemset4;

public class Problem2269 {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int count = 0;
        for (int i = 0; i < s.length() - k + 1; i++) {
            String n = "";
            for (int j = i; j < i + k; j++) {
                n += s.charAt(j);
            }

            int a = Integer.parseInt(n);
            if (a != 0 && num % a == 0) {
                count++;
            }
        }
        return count;
    }
}
