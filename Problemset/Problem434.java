class Solution {
    public int countSegments(String s) {
    if(s.isBlank()) return 0;
    s=s.trim();
     String[] words=s.split("\\s+");
     return words.length;   
    }
}