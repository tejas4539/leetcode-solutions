public class Problem1732 {
     public int largestAltitude(int[] gain) {
        int sum=0;
        int highest=0;
        int n=gain.length;
        for(int i=0;i<n;i++){
            sum+=gain[i];
            highest=Math.max(sum,highest);
        }
        return highest;
    }
}
