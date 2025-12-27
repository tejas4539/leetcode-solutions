import java.util.Arrays;

public class Problem2042 {
    public boolean areNumbersAscending(String s) {
        s = s.replaceAll("^\\D+", "");
        String[] nums = s.split("\\D+");
        System.out.println(Arrays.toString(nums));
        for (int i = 1; i < nums.length; i++) {
            int a = Integer.parseInt(nums[i]);
            int b = Integer.parseInt(nums[i - 1]);
            if (a <= b) {
                return false;
            }
        }
        return true;

    }
}
