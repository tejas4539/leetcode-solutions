import java.util.*;
class Problem575 {
    public int distributeCandies(int[] candyType) {
       Set<Integer> set=new HashSet<>();
       int n=candyType.length;
       for(int type:candyType){
        set.add(type);
       }  
       if(set.size()>=n/2){
        return n/2;
       }else{
           return set.size();
       }
    }
}