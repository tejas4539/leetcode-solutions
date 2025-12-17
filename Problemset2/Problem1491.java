import java.util.Arrays;

public class Problem1491 {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int n = salary.length;
        int sum = salary[1];
        for (int i = 2; i < n - 1; i++) {
            sum += salary[i];
        }
        double add = sum;
        return add / (n - 2);
    }
}
