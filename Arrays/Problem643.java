class Problem643 {
    public double findMaxAverage(int[] nums, int k) {
        int len=nums.length;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double max=sum;
            for(int i=k;i<len;i++){
                max+=nums[i]-nums[i-k];
                sum=Math.max(max,sum);
            }
        return sum/k;
    }
}