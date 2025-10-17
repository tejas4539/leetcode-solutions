import java.util.*;
class Problem448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       Set<Integer> set=new HashSet<>();
       List<Integer> result=new ArrayList<>();
       for(int n:nums){
        set.add(n);
       }
       int x=1;
       while(x<=nums.length){
         if(!set.contains(x)){
            result.add(x);
         }
         x++;
       }
       return result;
    }
}