class Problem136{
      public int singleNumber(int[] nums) {
       int single=0;
       for(int n:nums){
         single =single^n;
       }
       return single;
    }
}