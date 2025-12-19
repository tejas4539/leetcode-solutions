public class Problem1716 {
     public int totalMoney(int n) {
      if(n<=7){
        return n*(n+1)/2;
      } 
      else{
        int i=1;
        int sum=0;
        int j=1;
        int count=1;
        while(count<=n){
            sum+=i;
            if(count%7==0){
                i=j;
                j++;
            }
            i++;
            count++;
        }
        return sum;
      } 
       
    }
}
