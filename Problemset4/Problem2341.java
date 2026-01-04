package Problemset4;

public class Problem2341 {
    public int[] numberOfPairs(int[] nums) {
        int[] freq = new int[101];
        int[] res = new int[2];

        for (int n : nums) {
            freq[n]++;
        }
        for (int n : freq) {
            if (n != 0) {
                if (n % 2 == 0) {
                    if (n > 2) {
                        int a = n / 2;
                        res[0] += a;
                    } else {
                        res[0]++;
                    }

                } else {
                    if (n > 2) {
                        int a = n / 2;
                        res[0] += a;
                        res[1]++;
                    } else {
                        res[1]++;
                    }
                }
            }
        }
        return res;
    }
}
