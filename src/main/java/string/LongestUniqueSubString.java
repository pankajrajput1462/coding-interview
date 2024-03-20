package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestUniqueSubString {
    static String getUniqueCharacterSubstring(String str) {
        String output = "";
        int length = str.length();
        for (int start = 0; start < length; start++) {
            Set<Character> visited = new HashSet<>();
            int end = start;
            for (; end < length; end++) {
                char currChar = str.charAt(end);
                if (visited.contains(currChar)) {
                    break;
                } else {
                    visited.add(currChar);
                }
            }
            if (output.length() < end - start + 1) {
                output = str.substring(start, end);
            }
        }
        return output;
    }

    public static String getUniqueCharacterSubstringUsingMap(String input) {
        Map<Character, Integer> visited = new HashMap<>();
        String output = "";
        for (int start = 0, end = 0; end < input.length(); end++) {
            char currChar = input.charAt(end);
            if (visited.containsKey(currChar)) {
                start = Math.max(visited.get(currChar) + 1, start);
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end + 1);
                System.out.println("Output = " + currChar);
            }
            visited.put(currChar, end);
        }
        System.out.println("Final output = " + output);
        return output;
    }
}
