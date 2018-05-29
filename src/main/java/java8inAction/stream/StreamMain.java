package java8inAction.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Created by psi143 on 2/21/2017.
 */
public class StreamMain {
    public static void main(String[] args) {

        List<Dish> menu = Dish.menu;
    //    menu.forEach(System.out::println);
        IntSupplier runnable = () -> menu.size();
     //   System.out.println(runnable.getAsInt());
        List<String> filterdcallories = menu.stream().filter(dish -> dish.getCalories() > 400)
                .sorted(Comparator.comparing(Dish::getCalories)).map(Dish::getName).collect(toList());
        //filterdcallories.forEach(System.out::println);
        //menu.stream().filter(dish -> dish.getCalories()>400).distinct().forEach(System.out::println);
        /*List<Dish> collect = menu.stream().filter(Dish::isVegetarian).collect(Collectors.toList());
        collect.forEach((Dish dish) -> {
            System.out.println(dish.getName());
        });*/
        //filtering Unique element


        List<Integer> asList = Arrays.asList(2,4,6,7,8,7);
        List<Integer> list = asList.stream().filter((ints) -> ints % 2 == 0).collect(toList());
        //list.forEach(System.out::println);

        //filtering with type
        List<Dish> dishes = menu.stream().filter(dish -> dish.getType() == Dish.Type.MEAT).limit(2).collect(toList());
       // dishes.forEach(System.out::println);
        List<String> listOfDish = menu.stream().map(Dish::getName).collect(toList());

     //   listOfDish.forEach(System.out::println);
        //Sligtly different example
        List<String> words = Arrays.asList("Java8", "Lambdas", "In", "Action");
        List<Integer> collect = words.stream().map(String::length).collect(toList());
        //collect.forEach(System.out::println);

        List<Integer> collect1 = menu.stream().map(dish -> dish.getName())
                .map(String::length).collect(toList());
        //collect1.forEach(System.out::println);

        List<String> collect2 = words.stream().map(word -> word.split(" ")).
                flatMap(Arrays::stream).distinct().collect(toList());
        //collect2.forEach(System.out::println);'
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> square = numbers.stream().map(integer -> integer * integer).collect(toList());
        //square.forEach(System.out::println);
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        List<int[]> pairs =  numbers1.stream().
                            flatMap(i ->numbers2.stream().filter(j -> (i + j) % 3 == 0).map(j -> new int[]{i, j}))
                            .collect(toList());


        if (menu.stream().anyMatch(dish -> dish.isVegetarian()))
        {
            System.out.println("Vegiterian is there");
        }
        boolean b = menu.stream().allMatch(dish -> dish.getCalories() <1000);
        System.out.println(b);

        menu.stream().filter(Dish::isVegetarian).findAny().ifPresent(dish -> System.out.println(dish.getName()));
      //  System.out.println(any.get().getName());


    }
}
