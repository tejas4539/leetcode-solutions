import java.util.Stack;

public class Problem1784 {
    public boolean checkOnesSegment(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.add(c);
            } else if (c == '1' && stack.peek() != '1') {
                return false;
            } else {
                stack.add(c);
            }
        }
        return true;
    }
}
