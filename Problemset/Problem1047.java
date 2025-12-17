import java.util.Stack;

public class Problem1047 {
    Stack<Character> stack=new Stack<>();
    for(char c:s.toCharArray())
    {
        if (!stack.isEmpty() && c == stack.peek()) {
            stack.pop();
        } else {
            stack.add(c);
        }
    }
    StringBuilder sb = new StringBuilder();for(
    char ch:stack)
    {
        sb.append(ch);
    }return sb.toString();

}}
