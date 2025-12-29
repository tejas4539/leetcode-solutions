import java.util.Arrays;

public class Problem2160 {
    public int minimumSum(int num) {
        String s = String.valueOf(num);
        int[] res = new int[4];
        for (int i = 0; i < s.length(); i++) {
            res[i] = s.charAt(i) - '0';
        }
        Arrays.sort(res);
        int sum1 = res[0] * 10 + res[3];
        int sum2 = res[1] * 10 + res[2];
        return sum1 + sum2;

    }
}
