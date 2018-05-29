package objectmapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ObjectMaperMain {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        String[] list1 = {"Hello", "World"};
        list.addAll(Arrays.asList(list1));
        /*List<String[]> collect = list.stream().map(s -> s.split(" ")).
                distinct().collect(Collectors.toList());
*/

        //list.stream().map(s -> s.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()).forEach(System.out::println);
        int [] numarr ={1,2,3,4,5,6};
        new ArrayList<>();

    }
}
