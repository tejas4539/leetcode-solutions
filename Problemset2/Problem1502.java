import java.util.Arrays;

public class Problem1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int dis = arr[1] - arr[0];
        for (int i = 1; i < n - 1; i++) {
            if (arr[i + 1] - arr[i] != dis) {
                return false;
            }
        }
        return true;
    }
}
