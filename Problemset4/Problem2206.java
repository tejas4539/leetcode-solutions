class Problem2206 {
    public boolean divideArray(int[] nums) {
        int[] res = new int[501];
        for (int n : nums) {
            res[n] = res[n] + 1;
        }
        for (int n : res) {
            if (n % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}