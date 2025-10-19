class Problem717 {
    public boolean isOneBitCharacter(int[] bits) {
        int n=bits.length;
        if(n==1) return bits[0]==0;
        int k=0;

        for(int i=n-2;i>=0;i--){
          if(bits[i]==1){
              k++;
          }else{
              break;
          }
        }
        return k%2==0; 
       
    }
}