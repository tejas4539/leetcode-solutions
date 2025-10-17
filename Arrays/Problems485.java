class Problem485 {
    public int findMaxConsecutiveOnes(int[] nums) {
     int max=0;
     int j=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            max++;
           
        }else{
            if(j<max){
                j=max;
            }
            max=0;
        }

      }
      return max>j?max:j;
 
    }
}