package string;

// Java program to check if two strings are meta strings

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Test
{
    // Returns true if str1 and str2 are meta strings
    static int areMetaStrings(String str1, String str2)
    {
        int len1 = str1.length();
        int len2 = str2.length();

        if (len1 != len2)
            return -1;

        int prev = 0, curr = 0;

        int count = 0;
        for (int i=0; i<len1; i++)
        {
            if (str1.charAt(i) != str2.charAt(i))
            {
                count++;
                if (count > 2)
                    return -1;
                prev = curr;
                curr = i;
            }
        }

        final boolean b = count == 2 &&
                str1.charAt(prev) == str2.charAt(curr) &&
                str1.charAt(curr) == str2.charAt(prev);
        return count;
    }

    // Driver method
    public static void main(String args[]) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        /*final String src = reader.readLine();
        final String target = reader.readLine();*/

        String src = "1110";
        String target= "1101";

        System.out.println(areMetaStrings(src,target));
    }
}
