package Problemset4;

import java.util.Stack;

public class Problem150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String c = tokens[i];
            if (!c.equals("+") && !c.equals("-") && !c.equals("*") && !c.equals("/")) {
                stack.add(Integer.parseInt(c));
            } else {
                int a = 0;
                int b = 0;
                if (stack.size() > 1) {
                    a = stack.pop();
                    b = stack.pop();
                } else {
                    a = stack.pop();
                    b = Integer.parseInt(tokens[i + 1]);
                    i++;
                }

                if (c.equals("+")) {
                    stack.add(a + b);
                } else if (c.equals("-")) {
                    stack.add(b - a);
                } else if (c.equals("*")) {
                    stack.add(a * b);
                } else {
                    stack.add(b / a);
                }
            }
        }
        System.out.println(stack);
        return stack.pop();
    }
}
