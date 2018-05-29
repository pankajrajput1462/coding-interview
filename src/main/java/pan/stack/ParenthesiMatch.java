package pan.stack;

import java.util.Stack;

public class ParenthesiMatch {

    public static void main(String[] args) {

        String expression = "7-(x+y))";
        System.out.println(isParenthesisMatch(expression));

    }

    private static boolean isParenthesisMatch(String expression) {
        int count = 0;
        Stack<Integer> charStack = new Stack<>();
        char[] chars = expression.toCharArray();
        for (int i = 0; i <= chars.length - 1; i++) {
            if (chars[i] == '(') {
                System.out.println("Push: " + count);
                charStack.push(count++);
            } else if (chars[i] == ')') {
                if (!charStack.isEmpty()) {
                    System.out.println("POP: " + charStack.pop());
                }
            }
        }
        if (!charStack.isEmpty())
            return false;
        else
            return true;
    }
}
