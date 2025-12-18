public class Problem1684 {
     public int countConsistentStrings(String allowed, String[] words) {
         int count=0;
         for(int i=0;i<words.length;i++){
            int j=0;
            for(char c:words[i].toCharArray()){
                if(allowed.indexOf(c)!=-1){
                  j++;
                }else{
                    break;
                }
            }
            if(j==words[i].length()){
                count++;
            }
         }
         return count;
    }
    
}
