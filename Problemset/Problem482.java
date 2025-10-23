class Solution {
    public int hammingDistance(int x, int y) {
     String binary1 = String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
     String binary2 = String.format("%32s", Integer.toBinaryString(y)).replace(' ', '0');
     int count=0;
     int i=0;
     while(i<binary1.length()){
       if(binary1.charAt(i)!=binary2.charAt(i)) count++;
       i++;
     }
     return count;
    }
}