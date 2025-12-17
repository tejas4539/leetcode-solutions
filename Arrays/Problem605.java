class Problem605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       int count=0;
       int len=flowerbed.length;
       if(n==0) return true;
       if(len==1 && flowerbed[0]==0 ){
           return true;
       }
       if(len==1 && flowerbed[0]==1){
         return false;
       }
       if(flowerbed[0]==0 && flowerbed[1]==0) {
        count++;
        flowerbed[0]=1; 
       };
       for(int i=1;i<len-1;i++){
           if(flowerbed[i]==0 && flowerbed[i-1]!=1 && flowerbed[i+1]!=1){
               count++;
               flowerbed[i]=1;
           }
       }
       if(flowerbed[len-1]==0 && flowerbed[len-2]==0) count++;
       return count>=n;
    }
}