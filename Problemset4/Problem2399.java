package Problemset4;

import java.util.Arrays;

public class Problem2399 {
    public boolean checkDistances(String s, int[] distance) {
        int[] res = new int[26];
        Arrays.fill(res, -1);
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (res[index] == -1) {
                res[index] = i;
            } else {
                int dist = i - res[index] - 1;
                if (dist != distance[index]) {
                    return false;
                }
            }
        }

        return true;
    }
}
