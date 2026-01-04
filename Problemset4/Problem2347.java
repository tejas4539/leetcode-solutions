package Problemset4;

public class Problem2347 {
    public String bestHand(int[] ranks, char[] suits) {
        boolean flush = true;
        char c = suits[0];
        for (char a : suits) {
            if (a != c) {
                flush = false;
                break;
            }
        }
        if (flush)
            return "Flush";
        int[] r = new int[14];
        for (int n : ranks) {
            r[n]++;
        }
        boolean pair = false;
        for (int n : r) {
            if (n == 2)
                pair = true;
            if (n >= 3)
                return "Three of a Kind";
        }
        if (pair)
            return "Pair";
        return "High Card";

    }
}
