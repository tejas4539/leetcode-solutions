public class Problem1534 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int count = 0;
        int sum1, sum2, sum3;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    sum1 = Math.abs(arr[i] - arr[j]);
                    sum2 = Math.abs(arr[j] - arr[k]);
                    sum3 = Math.abs(arr[i] - arr[k]);
                    if (sum1 <= a && sum2 <= b && sum3 <= c) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
