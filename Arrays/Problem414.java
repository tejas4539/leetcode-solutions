import java.util.*;
class Problem414 {
    public int thirdMax(int[] nums) {
      Set<Integer> s1=new HashSet<>();
      for(int n:nums){
        s1.add(n);
      }
      int[] arr = s1.stream().mapToInt(Integer::intValue).toArray();
      Arrays.sort(arr);
      if(arr.length<3) return arr[arr.length-1];
      return arr[arr.length-3];
    }
}