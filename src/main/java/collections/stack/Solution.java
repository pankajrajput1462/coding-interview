package collections.stack;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public static boolean isBalanced(String s) {
        // Stack of opening brackets:
        Stack<Character> stack = new Stack<Character>();
        // Flag denoting whether or not the string is balanced:
        boolean balanced = true;

        // Iterate through each char 'ch' in the string and check if brackets are balanced:
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If 'ch' is an opening bracket:
            if ('(' == ch
                    || '[' == ch
                    || '{' == ch
                    ) {
                stack.push(ch);
            }
            // Else, 'ch' is a closing bracket:
            else {
                // If there's no opening brace to balance, then the string cannot be balanced.
                if (stack.empty()) {
                    balanced = false;
                    break;
                }
                // Check if 'ch' closes the opening bracket at the top of the stack.
                else {
                    char top = stack.pop();

                    // If the char popped off the 'top' of the stack doesn't match ch:
                    if ((top == '(' && ch != ')')
                            || (top == '[' && ch != ']')
                            || (top == '{' && ch != '}')
                            ) {
                        balanced = false;
                        break;
                    }
                }
            }
        }

        return (balanced && stack.empty()) ? true : false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {

            String s = scanner.next();
            System.out.println((isBalanced(s)) ? "YES" : "NO");

        }

        scanner.close();
    }
}
