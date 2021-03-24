package string;

import java.util.Arrays;

/**
 * Created by psi143 on 11/14/2016.
 */
public class StringUtil {
    /**
     * Permutation of string
     *
     * @param strForPermutation
     */
    public static void permutation(String strForPermutation) {
        permutation("", strForPermutation);
    }

    public static void removeDuplicates(char[] strArray) {

        if (strArray == null)
            return;
        int len = strArray.length;
        if (len < 2)
            return;
        int tail = 1;

        for (int i = 1; i < len; ++i) {
            int k;
            for (k = 0; k < tail; ++k) {
                if (strArray[k] == strArray[i])
                    break;
            }
            if (k == tail) {
                strArray[tail] = strArray[i];
                ++tail;
            }
        }
        strArray[tail] = 0;
      /*  System.out.println(strArray.length);
        for (char c :
                strArray) {
            System.out.println(c);
        }*/


    }


    public static boolean anagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] letters = new int[256];
        int num_unique_chars = 0;
        int num_completed_t = 0;
        char[] s_array = s.toCharArray();
        for (char c : s_array) { // count number of each char in s.
            if (letters[c] == 0) ++num_unique_chars;
            ++letters[c];
        }
        for (int i = 0; i < t.length(); ++i) {
            int c = (int) t.charAt(i);
            if (letters[c] == 0) { // Found more of char c in t than in s.
                return false;
            }
            --letters[c];
            if (letters[c] == 0) {
                ++num_completed_t;
                if (num_completed_t == num_unique_chars) {
                    // it’s a match if t has been processed completely
                    return i == t.length() - 1;
                }
            }
        }
        return false;
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0)
            System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i),
                        str.substring(0, i) + str.substring(i + 1, n));
        }
    }

    public static void permutationSortedOrderRepeatingChar(String str) {
        final int length = str.length();
        final char[] data = new char[length + 1];
        final char[] temp = str.toCharArray();
        Arrays.sort(temp);
        str = new String(temp);
        allLexographicRec(str, data, length - 1, 0);
    }

    private static void allLexographicRec(String source, char[] data, int last, int index) {
        final int length = source.length();
        for (int i = 0; i < length; i++) {
            data[index] = source.charAt(i);
            if (index == last) {
                System.out.println("Permutation: "+new String(data));
            } else {
                allLexographicRec(source, data, last, index + 1);
            }
        }
    }

}
