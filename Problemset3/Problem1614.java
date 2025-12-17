import java.util.Stack;

public class Problem1614 {
    public int maxDepth(String s) {
        int count = 0;
        int maxCount = 0;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            stack.push(c);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                maxCount = Math.max(count, maxCount);
                count--;
            }
        }
        return maxCount;
    }
}
