package javainaction.javaone;

import java.util.function.*;

public class FunctionPredicate {

    public static void print(int number, Predicate<Integer> predicate, String message) {
        System.out.println(number + " " + message + " " + predicate.test(number));
    }

    public static void main(String[] args) {

        Predicate<Integer> isEven = e -> e % 2 == 0;
        Predicate<Integer> isGT4 = e -> e > 7;
        //print(6, isEven, "iseven ?");
        print(8, isEven.and(isGT4), "combination of both predicate :");
        print(9, isEven.or(isGT4), "combination of both predicate :");
    }

}
