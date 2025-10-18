import java.util.*;

class Problem561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int add=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
              add+=nums[i];
            }
        }
        return add;
    }
}