class Solution {
    public char findTheDifference(String s, String t) {
        int sum=0;
        for(int j=0;j<t.length();j++){
            sum+=t.charAt(j);
        }
        for(int i=0;i<s.length();i++){
            sum-=s.charAt(i);
        }
       
        return (char)sum;
    }

}