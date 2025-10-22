class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        boolean res = true;
        if(nums.length ==1) return res;
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[k] <= nums[i]) {
                res = true;
            } else {
                res = false;
                break;
            }
            k++;
        }
        if (!res) {
            k = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[k] >= nums[i]) {
                    res = true;
                } else {
                    res = false;
                    break;
                }
                k++;
            }
        }
        return res;
    }
}