import java.util.Arrays;

public class Problem1619 {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int index = (5 * n) / 100;
        double meanLength = n - (index * 2);
        double sum = 0;
        for (int i = index; i < n - index; i++) {
            sum += arr[i];
        }
        return sum / meanLength;
    }
}
