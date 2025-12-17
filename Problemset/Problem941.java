public class Problem941 {
     public boolean validMountainArray(int[] arr) {
        int max = 0;
        if(arr.length<3) return false;
        int n = arr.length - 1;

        for (int i=1;i<n;i++) {
           if(arr[max]<arr[i]){
             max=i;
           }
        }
        if (arr[max] == arr[0])
            return false;
        int k = 0;
        for (int i = 1; i <=max; i++) {
            if (arr[i] <= arr[k])
                return false;
            k++;
        }
        int l = n;
        for (int i = n - 1; i >= max; i--) {
            if (arr[i] <= arr[l])
                return false;
            l--;
        }
        return true;
    }
}
