public class Problem1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            String s = String.valueOf(i);
            int n = s.length();
            if (n > 0 && n % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
