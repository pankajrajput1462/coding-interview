package function;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

class FunctionalInterfaceTest {
    @Test
    void predicateTest() {
    }

    @Test
    void supplierTest() {
         /*
         Suppliers
         The Supplier functional interface is yet another Function specialization that does not take
          any arguments. We typically use it for lazy generation of values. For instance, let’s define a
          function that squares a double value.
            It will not receive a value itself, but a Supplier of this value:
         */
        double sqr = squareLazy(() -> 3);
        Assertions.assertEquals(9, sqr);
    }

    @Test
    void consumerTest() {
        Supplier<String> supplier = () -> "Pankaj";
    }

    @Test
    void operatorFuntionalInterfaceTest() {
        List<String> names = Arrays.asList("bob", "josh", "megan");

        names.replaceAll(String::toUpperCase);
        names.forEach(System.out::println);
    }

    public double squareLazy(Supplier<Integer> lazyValue) {
        return Math.pow(lazyValue.get(), 2);
    }
}
