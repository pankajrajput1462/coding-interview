package patternMatch;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Pattern search in sentence
 */
public class PatternMatch {
    /**
     * '
     * This method is responsible for find the pattern in search.It will give you result of total pattern found in sentence
     *
     * @param text sentence for search
     * @param pat  pattern
     */
    public static int patternSearch(String text, String pat) {
        int t_len = text.length();
        int p_len = pat.length();
        AtomicInteger count = new AtomicInteger();
        for (int i = 0; i <= t_len - p_len; i++) {

            int k;
            // for current index i check the pattern
            for (k = 0; k < p_len; k++) {
                if (text.charAt(i + k) != pat.charAt(k))
                    break;
            }
            if (k == p_len) {
                System.out.println("pattern found at:  = " + i);
                count.incrementAndGet();
            }
        }
        return count.get();
    }

    /**
     * function that matches input string wild card
     */
    public static boolean strMatch(String text, String pattern, int s_len, int p_len) {
        if (p_len == 0) {
            return (s_len == 0);
        }
        //Initialise table for strong results of sub problems
        boolean[][] lookup = new boolean[s_len + 1][p_len + 1];

        for (int i = 0; i < s_len + 1; i++) {
            Arrays.fill(lookup[i], false);
        }
        //empty pattern can match with empty string
        lookup[0][0] = true;
        // Only * can match with empty string
        for (int j = 1; j <= p_len; j++) {
            if (pattern.charAt(j - 1) == '*') {
                lookup[0][j] = lookup[0][j - 1];
            }
        }
        for (int i = 1; i <= s_len; i++) {
            for (int j = 1; j <= p_len; j++) {
                if (pattern.charAt(j - 1) == '*') {
                    lookup[i][j] = lookup[i][j - 1] || lookup[i - 1][j];
                } else if (pattern.charAt(j - 1) == '?' || text.charAt(i - 1) == pattern.charAt(j - 1)) {
                    lookup[i][j] = lookup[i - 1][j - 1];
                } else {
                    lookup[i][j] = false;
                }
            }
        }

        return lookup[s_len][p_len];
    }

}
