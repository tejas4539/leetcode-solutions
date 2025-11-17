package Problemset2;

public class Problem1137 {
   public int tribonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        int j = 1;
        int k = 1;
        int i = 0;
        int sum = i + j + k;
        for (int l = 3; l <= n; l++) {
            sum = i + j + k;
            i = j;
            j = k;
            k = sum;
        }
        return sum;

    }
}
