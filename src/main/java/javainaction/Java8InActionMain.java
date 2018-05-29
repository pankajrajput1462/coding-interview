package javainaction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntSupplier;

/**
 * Created by psi143 on 2/20/2017.
 */
public class Java8InActionMain {
    public static void main(String[] args) {

        List<Apple> appleList = new ArrayList<>();
        Apple apple1 = new Apple("Indian", "red", "cold", "India", 100);
        Apple apple2 = new Apple("kashmiri", "green", "cold", "India", 80);
        Apple apple3 = new Apple("london", "reddish", "Extremecold", "London", 10);
        Apple apple4 = new Apple("watford", "red", "Extremecold", "London", 1009);
        Apple apple5 = new Apple("london", "deeptred", "Extremecold", "London", 100);
        Apple apple6 = new Apple("himachal", "white", "cold", "India", 90);
        Apple apple7 = new Apple("Indian", "red", "cold", "India", 100);

        appleList.add(apple1);
        appleList.add(apple2);
        appleList.add(apple3);
        appleList.add(apple4);
        appleList.add(apple5);
        appleList.add(apple6);
        appleList.add(apple7);
        // appleList.forEach(System.out::println);

        //  List<Apple> filterApples = filterApples(appleList, apple -> "red".equals(apple.getColor()));
        //  filterApples.forEach(System.out::println);
        // List<Apple> filter = filter(appleList, apple -> "green".equals(apple.getColor()));
        //   filter.forEach(System.out::println);

        // appleList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        // appleList.sort((o1, o2) -> o1.getPlace().compareTo(o2.getPlace()));
        //  appleList.sort(Comparator.comparingInt(value -> value.getWeight()));
        //  appleList.forEach(System.out::println);
        // appleList.sort(Comparator.comparing(Apple::getPlace));


        IntSupplier supplier = () -> 56;
        System.out.println(supplier.getAsInt());

        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }, "One");



    }

    public static <T> List<T> filter(List<T> tofiltor, CustomPredicate<T> customPredicate) {
        List<T> tList = new ArrayList<>();
        for (T t : tofiltor) {
            if (customPredicate.testPredicate(t)) {
                tList.add(t);
            }
        }
        return tList;
    }


    private static List<Apple> filterApples(List<Apple> appleList, ApplePredicate predicate) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple : appleList) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    //
}
