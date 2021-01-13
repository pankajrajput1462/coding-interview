package collections.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BracketMatch {

    public boolean isBracketMatch(String bracket) {
        if (bracket.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (char singleBracket : bracket.toCharArray()) {
            if (singleBracket == '{' || singleBracket == '[' || singleBracket == '(') {
                stack.push(singleBracket);
            } else {
                if (singleBracket == ')' || singleBracket == '}' || singleBracket == ']') {
                    if (stack.isEmpty())
                        return false;
                    final Character last = stack.peek();
                    if (singleBracket == '}' && last == '{' || singleBracket == ')'
                            && last == '(' || singleBracket == ']' && last == '[') {
                        stack.pop();

                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}