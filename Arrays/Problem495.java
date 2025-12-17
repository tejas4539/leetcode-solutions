
class Problem495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length==0) return 0;
        int time=0;
        for(int i=0;i<timeSeries.length-1;i++){
            time+=Math.min(duration,timeSeries[i+1]-timeSeries[i]);
        }
        time+=duration;
        return time;
    }
}