import java.util.*;
class Problem599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int minIndex=Integer.MAX_VALUE;
        int index=0;
        HashMap<String,Integer> hm=new HashMap<>();
        ArrayList<String> al=new ArrayList<>();
        
        for(String n:list1){
            hm.put(n,index);
            index++;
        }
        System.out.println(hm);
       
        for(int i=0;i<list2.length;i++){
             if(hm.containsKey(list2[i]) && hm.get(list2[i])+i<=minIndex){
                 if(hm.get(list2[i])+i<minIndex){
                    al.clear();
                    minIndex=hm.get(list2[i])+i;
                 }
                al.add(list2[i]);     
             }  
        }
        String[] arr = al.toArray(new String[0]);
        return arr;
    }
}