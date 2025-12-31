import java.util.Stack;

public class Problem2210 {
    public int countHillValley(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                stack.add(nums[i]);
            }
            if (nums[i] != stack.peek()) {
                stack.add(nums[i]);
            }
        }
        int count = 0;
        for (int i = 1; i < stack.size() - 1; i++) {
            if (stack.get(i) > stack.get(i - 1) && stack.get(i) > stack.get(i + 1)) {
                count++;
            } else if (stack.get(i) < stack.get(i - 1) && stack.get(i) < stack.get(i + 1)) {
                count++;
            }
        }
        return count;
    }
}
