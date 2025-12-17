class Problem268{
        public int missingNumber(int[] nums) {
       int n=nums.length+1;
       int sum=0;
       int currsum=0;
       for(int x:nums){
        sum+=x;
       }
        for(int i=0;i<n;i++){
            currsum+=i;
        }
        return currsum-sum;
    }
}