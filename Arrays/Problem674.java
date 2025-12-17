class Problem674 {
    public int findLengthOfLCIS(int[] nums) {
       int n=nums.length;
       if(n==1) return 1;
       int count =1;
       int maxcount=1;
       for(int i=1;i<n;i++){
        if(nums[i]>nums[i-1]){
            count++;
        }else{
            count=1;
        }
          maxcount=Math.max(count,maxcount);
       }
       
       return maxcount;
    }
}