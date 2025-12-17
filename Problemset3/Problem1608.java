class Problem1608 {
    public int specialArray(int[] nums) {
        int count = 0;
        int n = nums.length;
        int i = 0;
        while (i <= n) {
            for (int j = 0; j < n; j++) {
                if (i <= nums[j]) {
                    count++;
                }
            }
            if (count == i) {
                return count;
            } else {
                count = 0;
            }
            i++;
        }

        return -1;
    }
}