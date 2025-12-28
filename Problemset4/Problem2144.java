import java.util.Arrays;

public class Problem2144 {
    public int minimumCost(int[] cost) {
        int sum = 0;
        Arrays.sort(cost);
        int j = 0;
        int n = cost.length;
        for (int i = n - 1; i >= 0; i--) {
            if (j < 2) {
                sum += cost[i];
                j++;
            } else {
                j = 0;
            }
        }
        return sum;
    }
}
