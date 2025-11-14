package Problemset2;

public class Problem1221 {
    public int balancedStringSplit(String s) {
        int ans=0;
        int j=0;
        for(char c:s.toCharArray()){
            if(c=='L'){
                j++;
            }
            else{
                j--;
            }
            if(j==0){
                ans++;
            }
        }
        return ans;
    }
}
