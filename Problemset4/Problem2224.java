public class Problem2224 {
     public int convertTime(String current, String correct) {
        int a1=Integer.parseInt(current.substring(0,2));
        int a2=Integer.parseInt(current.substring(3));

        int b1=Integer.parseInt(correct.substring(0,2));
        int b2=Integer.parseInt(correct.substring(3));
   

       int curr=a1*60+a2;
       int corr=b1*60+b2;
     
       int count=0;
       while(curr!=corr){
        if(corr-curr>=60){
            curr+=60;
        }
        else if(corr-curr>=15){
            curr+=15;
        }
        else if(corr-curr>=5){
            curr+=5;
        }else{
            curr+=1;
        }
        count++;
       }
       return count;

    }
}
