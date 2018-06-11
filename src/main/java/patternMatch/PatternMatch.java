package patternMatch;

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

}
