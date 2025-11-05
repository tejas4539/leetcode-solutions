public class Problem1009 {
   public int bitwiseComplement(int n) {
        String binary = Integer.toString(n, 2);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                sb.append('0');
            }else{
               sb.append('1');
            }
        }
       return Integer.parseInt(sb.toString(),2);
    }  
}
