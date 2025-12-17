import java.util.*;

class Problem682 {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int x;
        int y;
        for (String str : operations) {
            if (str.equals("+")) {
                x = stack.pop();
                y = stack.peek();
                stack.push(x);
                stack.push(x + y);
            } else if (str.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (str.equals("C")) {
                stack.pop();
            } else {
                int s = Integer.parseInt(str);
                stack.push(s);
            }

        }

        int score = 0;
        while (!stack.isEmpty()) {
            score += stack.pop();
        }
        return score;
    }
}