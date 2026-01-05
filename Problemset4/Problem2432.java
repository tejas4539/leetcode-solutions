package Problemset4;

public class Problem2432 {
    public int hardestWorker(int n, int[][] logs) {
        int[] taskTime = new int[n];
        int prev = 0;
        for (int i = 0; i < logs.length; i++) {
            int time = logs[i][1] - prev;
            if (time > taskTime[logs[i][0]]) {
                taskTime[logs[i][0]] = time;
            }
            prev = logs[i][1];
        }
        int maxTime = 0;
        int empId = 0;
        for (int i = 0; i < n; i++) {
            if (taskTime[i] >= maxTime) {
                if (taskTime[i] > maxTime) {
                    maxTime = taskTime[i];
                    empId = i;
                } else if (taskTime[i] == maxTime && i < empId) {
                    empId = i;
                }
            }
        }
        return empId;

    }
}
