class Solution {
    public int findLUSlength(String a, String b) {
     if(a.equals(b)) return -1;
     int alen=a.length();
     int blen=b.length();
     if(blen>alen) return blen;
     return alen;   
    }
}