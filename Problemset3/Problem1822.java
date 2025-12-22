import java.util.ArrayList;

public class Problem1822 {
    public int arraySign(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : nums) {
            list.add(n);
        }
        if (list.contains(0))
            return 0;
        int num = 0;
        for (int i : list) {
            if (i < 0) {
                num++;
            }
        }
        if (num % 2 == 0)
            return 1;
        return -1;

    }
}
