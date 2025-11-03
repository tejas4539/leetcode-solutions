public class Problem942 {
       public int[] diStringMatch(String s) {
        int n=s.length();
        int[] res=new int[n+1];
        int i=0;
        int l=0;
        for(int k=0;k<s.length();k++){
            if(s.charAt(k)=='I'){
                res[l]=i;
                i++;
            }else if(s.charAt(k)=='D'){
                res[l]=n;
                n--;
            }
            l++;

        }
        res[l]=i;
        return res;
    }
}
