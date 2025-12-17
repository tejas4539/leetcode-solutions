import java.util.Hashtable;
class Problem217{
     public boolean containsDuplicate(int[] nums) {
        Hashtable<Integer, Boolean> ht = new Hashtable<>();
        for(int n:nums){
           if(ht.containsKey(n)){
            return true;
           }else{
            ht.put(n,true);
           }
        }
        return false;

    }
}