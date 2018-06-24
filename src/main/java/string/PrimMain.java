package string;

import java.util.ArrayList;
import java.util.List;

public class PrimMain {

    public static void main(String[] args) {
        List<Integer> factorOfInt = findFactorOfInt(90);
        for (Integer integer :
                factorOfInt) {
            if (isNoPrime(integer))
            {
                System.out.println("PrimeFactor: "+integer);
            }
        }
    }

    private static List<Integer> findFactorOfInt(int factor) {
        List<Integer> factorList= new ArrayList<>();

        if (factor==1) {
            System.out.println(factor);
            factorList.add(factor);
        } else {
            for (int i = 1; i <= (factor / 2); i++) {
                if (factor%i==0)
                {
                    //System.out.println("Factor : "+i);
                    factorList.add(i);
                }

            }
           // System.out.println("Factor : "+factor);
            factorList.add(factor);
        }

        return factorList;
    }

    private static boolean isNoPrime(int number) {
        if ((number != 1) && (number != 0)) {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

}
