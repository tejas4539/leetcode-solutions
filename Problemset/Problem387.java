class Solution {
    public int firstUniqChar(String s) {
       char[] ch=s.toCharArray();
       for(int i=0;i<ch.length;i++){
           if(s.indexOf(ch[i])==s.lastIndexOf(ch[i])){
            return i;
           }
       }
       return -1;
    }
}