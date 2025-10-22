import java.util.*;

class Problem860 {
    public boolean lemonadeChange(int[] bills) {
             int five=0;int ten=0;
       for(int bill:bills){
           if(bill==5){
               five++;
           }
           else if(bill==10){
               ten++;
               if(five>0){
                   five--;
               }else{
                   return false;
               }
           }else if(bill==20){
               if(five>0 && ten>0){
                   five--;
                   ten--;
               }
               else if(five>2){
                   five-=3;
               }else{
                   return false;
               }
           }
       }
		return true;
    }
}