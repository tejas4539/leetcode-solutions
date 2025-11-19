public class Problem1299 {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return new int[] { -1 };
        int[] res = new int[n];
        int j = 0;
        res[n - 1] = -1;
        while (j < n - 1) {
            int greater = arr[j + 1];
            for (int i = j + 2; i < n; i++) {
                greater = Math.max(greater, arr[i]);
            }
            res[j] = greater;
            j++;
        }
        res[j] = -1;
        return res;
    }
}
