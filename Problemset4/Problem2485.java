package Problemset4;

public class Problem2485 {
    public int pivotInteger(int n) {
        int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            totalSum += i;
        }
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            totalSum -= i;
            if (temp == totalSum) {
                return i;
            }
            temp += i;
        }
        return -1;
    }
}
