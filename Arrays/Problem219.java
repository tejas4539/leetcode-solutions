import java.util.HashMap;
class Problem219{
     public boolean containsNearbyDuplicate(int[] nums, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();
        int i=0;
        for (int n : nums) {
          if(map.containsKey(n) && map.get(n)!=i && k>= Math.abs(map.get(n)-i)){
               return true;
          }else{
            map.put(n,i);
          }
          i++;
        }
 

         return false;

    }
}