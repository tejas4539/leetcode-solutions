package Problemset4;
import java.util.ArrayList;
import java.util.List;

public class Problem1441 {

     public List<String> buildArray(int[] target, int n) {
      List<String> li=new ArrayList()<>(); 
       List<Integer> li2=new ArrayList<>();   
       List<Integer> li1=new ArrayList<>();  
       for(int a:target){
        li2.add(a);
       }
       for(int i=1;i<=n;i++){
        li.add("Push");
        if(!li2.contains(i)){
            li.add("Pop");
        }else{
            li1.add(i);
        }
        if(li1.size()==li2.size()){
            break;
        }
       }
       return li;
    }
}