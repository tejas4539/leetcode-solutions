package Problemset4;

import java.util.Arrays;

public class Problem2335 {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        int count = 0;
        while (amount[0] + amount[1] > amount[2]) {
            count++;
            amount[0]--;
            amount[1]--;
        }
        return amount[2] + count;
    }
}
