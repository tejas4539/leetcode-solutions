class Problem283{
    public void moveZeroes(int[] nums) {
        int k = 0;

        for (int j=0;j<nums.length;j++) {
            if (nums[j]!=0) {
                int temp=nums[j];
                nums[j]=nums[k];
                nums[k]=temp;
                k++;
            }
        }
    }
}