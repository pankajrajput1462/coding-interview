package pan.org;

import java.util.function.BinaryOperator;
import java.util.function.Function;

class Utils {

    public static Integer add1(Integer x) {
        return x + 1;
    }

    public static String concat1(String x) {
        return x + 1;
    }

}

@FunctionalInterface
interface Foo {
    String method(String string);
}


public class App {
    public String add(String string, Foo foo) {
        return foo.method(string);
    }

    public static void main(String[] args) {
        //For execute the functional interface

        Foo foo = string -> string + "pankaj";
        System.out.println(foo);

        System.out.println("Hello World!");
        Function<String, String> funObject = s -> s + "pankaj";
        System.out.println(funObject.apply("idiot"));
        Function<Integer, String> function = integer -> Integer.toString(integer);
        System.out.println(function.apply(99));

        Function<Integer, Integer> addFormutil = Utils::add1;
        Integer apply = addFormutil.apply(55);
        System.out.println(apply);
        Function<Integer, Function<String, String>> complex = integer -> s -> s + "kk";
        System.out.println(complex.apply(88));
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        Integer apply1 = binaryOperator.apply(5, 7);
        System.out.println(apply1);



    }
}
