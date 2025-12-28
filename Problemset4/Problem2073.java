public class Problem2073 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                sum1 += Math.min(tickets[i], tickets[k]);
            } else {
                sum2 += Math.min(tickets[i], tickets[k] - 1);
            }
        }
        return sum1 + sum2;

    }
}
