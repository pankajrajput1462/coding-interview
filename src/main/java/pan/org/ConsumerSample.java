package pan.org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerSample {
    public static void main(String[] args) {
        List<One> list = new ArrayList<>();
        list.add(new One(2, 6, 9));
        list.add(new One(6, 8, 9));
        list.add(new One(2, 6, 3));
        list.add(new One(2, 7, 9));

        List<Integer> integers= new ArrayList<>();


        List<One> newlist = new ArrayList<>();

        list.stream().filter(one -> one.getOne()==6).forEach(newlist::add);
        newlist.forEach(System.out::println);

        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        items.forEach((k, v) -> System.out.println(k+" "+v));

        Consumer<Integer> integerConsumer= integer -> {
            System.out.println(integer);
            boolean l = false;
            System.out.println(l);

        };

        integerConsumer.accept(5);

        Supplier<One> oneSupplier= () -> new One(5,9,8);
        One one = oneSupplier.get();

    }
}
