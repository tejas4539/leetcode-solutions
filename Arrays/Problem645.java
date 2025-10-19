class Problem645 {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualsum = 0;
        for (int num : nums) {
            actualsum += num;
        }
        int duplicate = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                duplicate = nums[i];
                break;
            }
        }
        int missing = expectedSum - (actualsum - duplicate);
        return new int[] { duplicate, missing };
    }
}