package org.string;

/**
 * Created by psi143 on 2/17/2017.
 */
public class UniqueCharInString {


    public static void main(String[] args) {
        String str = "PANKJ umrr lsX";
        //System.out.println(uniqueCharInString(str));;
        System.out.println(isUniqueChar(str));
        ;
        System.out.println(isUniqueCharInString("kuumar"));
    }

    private static boolean isUniqueChar(String str) {

        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0)
                return false;
            checker |= (1 << val);
        }
        return true;
    }

    private static boolean isUniqueCharInString(String str) {
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}
