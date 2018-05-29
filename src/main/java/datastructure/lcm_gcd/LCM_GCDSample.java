package datastructure.lcm_gcd;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by psi143 on 2/17/2017.
 */
@Slf4j
public class LCM_GCDSample {

    public static void main(String[] args) {

        int gcd=gcd(30,15);
        //finding GCD of Array of integers
        int []findGcdFromArray={10,15,20};
        long gcdArray = gcd(findGcdFromArray);


        log.info("GCD= "+gcd+" Multiple: "+gcdArray);
    }

    private static long gcd(int[] findGcdFromArray) {
        int result = findGcdFromArray[0];
        for (int i = 1; i < findGcdFromArray.length; i++) {
            result=gcd(result,findGcdFromArray[i]);
        }
        return result;
    }


    private static int gcd(int p, int q) {

        while (q>0)
        {
            int temp=q;
            q=p%q;
            p=temp;
        }
        return p;
    }
}
