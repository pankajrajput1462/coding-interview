package collections.stack;

import java.util.Stack;

public class BracketMatch {
    public boolean isBracketMatch(String string) {
        char[] chars = string.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length - 1; i++) {
            char bracket = chars[i];
            if (bracket == '{' || bracket == '[' || bracket == '(') {
                stack.push(bracket);
            } else {
                Character pop = stack.pop();
                if (bracket == ')' || bracket == '}' || bracket == ']') {

                }
            }
        }
        return false;
    }
}
