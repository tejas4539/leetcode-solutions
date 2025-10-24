class Solution {
    public String reverseWords(String s) {
     String[] words=s.split(" ");
     String ans="";
     for(int i=0;i<words.length;i++){
        String rev=new StringBuilder(words[i]).reverse().toString();
        ans+=rev+" ";
     }   
     return ans.substring(0,ans.length()-1);
    }
}