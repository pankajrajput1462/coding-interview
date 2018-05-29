package org.string;

/**
 * Created by psi143 on 11/14/2016.
 */
public class EuclidAlgo {
//Recursive Implementation

    public static int gcd(int p, int q)

    {
        if (q == 0)
            return p;
        else
            return gcd(q, p % q);
    }

    //Non -Recursive
    public static int gcdNonR(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }


    public static void main(String[] args) {
        System.out.println(gcd(8, 2));
        System.out.println(gcdNonR(8, 2));
    }

}
