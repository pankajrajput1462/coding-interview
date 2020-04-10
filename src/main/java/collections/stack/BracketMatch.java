package collections.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BracketMatch {

    public boolean isBracketMatch(String bracket) {
        if (bracket.isEmpty()) {
            return true;
        }
        char[] chars = bracket.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        for (char singleBracket : chars) {
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