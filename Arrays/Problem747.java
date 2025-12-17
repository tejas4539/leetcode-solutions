class Problem747 {
    public int dominantIndex(int[] nums) {
       int maxNum=nums[0];
       int index=0;
       for(int i=1;i<nums.length;i++){
        if(nums[i]>maxNum){
            maxNum=nums[i];
            index=i;
        }
       }
       for(int n:nums){
        if(n!=maxNum && maxNum<n*2){
            return -1;
        }
       }   
       return index;
    }
}