package Problemset4;

public class Problem2455 {
    public int averageValue(int[] nums) {
        int count = 0;
        int sum = 0;
        for (int n : nums) {
            if (n % 2 == 0 && n % 3 == 0) {
                sum += n;
                count++;
            }
        }
        if (count == 0)
            return 0;
        return sum / count;
    }
}
