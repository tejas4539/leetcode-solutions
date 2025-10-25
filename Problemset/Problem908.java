class Solution {
    public int smallestRangeI(int[] nums, int k) {
      int max=nums[0];
      int min=nums[0];
    for(int n:nums){
        if(n>max) max=n;
        if(n<min) min=n;
    } 
     for(int i=0;i<k;i++){
       max-=1;
       min+=1;
       if(min>max || max==min) return 0;
     }    
     return max-min;
    }
}