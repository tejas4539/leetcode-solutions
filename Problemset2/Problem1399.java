import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem1399 {
     public int countLargestGroup(int n) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int count=0;
        for(int i=1;i<=n;i++){
         if(i<10){
            map.computeIfAbsent(i,k->new ArrayList<>()).add(i);
         }
         else{
            int sum=0;
            int num=i;
           while(num>0){
              sum+=num%10;
              num/=10;

           }
           map.computeIfAbsent(sum,k->new ArrayList<>()).add(i);
         }
       } 

       int largest=1;
       for(List<Integer> value:map.values()){
           if(value.size()>largest){
            largest=value.size();
            count=1;
           }
           else if(value.size()==largest){
            count++;
           }
       }
       return count;
    }
}
