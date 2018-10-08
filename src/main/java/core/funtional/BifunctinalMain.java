package core.funtional;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BifunctinalMain {

    BiConsumer<String,String> biConsumer= (s, s2) -> {

    };

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        BiConsumer<Integer,String> biConsumer=(key, value) -> {
            System.out.println("key = " + key+": Value = "+value);
        };
        map.forEach(biConsumer);

        BiFunction<Integer,Integer,Integer> biFunction=(x, y) -> x+y;
        Integer apply = biFunction.apply(5, 6);
        System.out.println("apply = " + apply);
        Float apply1 = biFunction.andThen(Integer::floatValue).apply(5, 6);
        System.out.println("apply1 = " + apply1);
        BiPredicate<Integer,String> biPredicate = (integer, s) -> integer.floatValue()>3&&!s.isEmpty();
        boolean pankaj = biPredicate.test(8, "pankaj");
        System.out.println("pankaj = " + pankaj);
    }

}
