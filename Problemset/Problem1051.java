import java.util.Arrays;

public class Problem1051 {
      public int heightChecker(int[] heights) {
       int[] excepted=heights.clone();
       Arrays.sort(heights);
       int count=0;
       int j=0;
       for(int i:heights){
         if(excepted[j]!=i){
            count++;
         }
         j++;
       } 
       return count;
    }
}
