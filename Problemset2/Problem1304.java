public class Problem1304 {
    public int[] sumZero(int n) {
        if (n == 1)
            return new int[] { 0 };
        int[] res = new int[n];
        int k = 1;
        int left = 0;
        int right = n - 1;
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                res[left] = k;
                res[right] = -k;
                left++;
                right--;
                k++;
            }
        } else {
            for (int i = 0; i < n / 2; i++) {
                res[left] = k;
                res[right] = -k;
                left++;
                right--;
                k++;
            }
            res[n / 2] = 0;
        }
        return res;
    }
}
