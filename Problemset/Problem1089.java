public class Problem1089 {
      public void duplicateZeros(int[] arr) {
       for(int i=0;i<arr.length;i++){
        if(arr[i]==0 && i<arr.length-1){
            for(int l=arr.length-1;l>i+1;l--){
                arr[l]=arr[l-1];
            }
            arr[i+1]=0;
            i++;
        }
       }   
    }
}
