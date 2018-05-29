package basicAlgo;

import java.text.MessageFormat;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       /* StringUtil stringUtil = new StringUtil();
        System.out.println("Permutations are :  ");
        stringUtil.permutation("ABC");
        System.out.println(" \n ******************** \n");
        Combinations combobj = new Combinations("ABC");
        System.out.println("Combinations are :  ");
        combobj.combine();
*/
        final String pankaj = MessageFormat.format("My name is {0} in India {1}", "pankaj","pll");
        System.out.println("pankaj = " + pankaj);

     /*   BruteForceAlgo forceAlgo= new BruteForceAlgo();
        String pat="abbbbbbaaaabbbccccc";
        String  pattern="sdjkgagsdapankajllll";


        int offset1a = forceAlgo.search1(pat, "ccccc");
        System.out.println(offset1a);
        int offset2a = forceAlgo.search2(pat, "ab");
        int offset3a = forceAlgo.search2(pattern, "pankaj");
       // int offset1b = forceAlgo.search1(pattern, "pankaj");
        //int offset2b = forceAlgo.search2(pattern, "pankaj");
        System.out.println(offset1a+" "+offset2a+" "+offset3a);


*/

        // System.out.println(RecursiveFunction.fibonaaci());
        // StringUtil.removeDuplicates("pankaj".toCharArray());
        //   boolean anagram = StringUtil.anagram("Pan", "nP");
        // System.out.println(anagram);
    }
}
