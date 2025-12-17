import java.util.*;
class Problem350 {
    public int[] intersect(int[] nums1, int[] nums2) {
       HashMap<Integer,Integer> hm1=new HashMap<>();
       for(int n:nums1){
        hm1.put(n,hm1.getOrDefault(n,0)+1);
       } 
       List<Integer> li=new ArrayList<>();
       for(int n:nums2){
        if(hm1.containsKey(n) && hm1.get(n)>0){
            li.add(n);
            hm1.put(n,hm1.get(n)-1);
        }
       }
        int[] res = new int[li.size()];
        for (int i = 0; i < li.size(); i++) {
            res[i] = li.get(i);
        }
        return res;
    }
}