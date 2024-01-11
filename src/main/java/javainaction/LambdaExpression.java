package javainaction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by psi143 on 2/21/2017.
 */
public class LambdaExpression {
    static String fileUrl = "C:\\Users\\psi143\\git\\usecase\\usecase\\src\\main\\java\\java8inAction\\sample.txt";


    public static void main(String[] args) {

        composingFunction();
          /*  List<String> list= new ArrayList<>();
            list.add("India");
            list.add("pankaj");
            list.add("saurav");
        List<String> filter = filter(list, s -> s.equals("pankaj"));*/
        // processfile();
      /*  try {
            String line = processFile((BufferedReader reader) -> reader.readLine() + reader.readLine());
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        List<String> str = Arrays.asList("a", "b", "A", "B");
        str.sort(String::compareTo);
        str.sort(String::compareToIgnoreCase);
        str.sort(String::compareTo);
        str.sort(String::compareToIgnoreCase);
        Function<Apple, Integer> getWeight = Apple::getWeight;
        Supplier<Apple> aNew = Apple::new;
        Apple apple = aNew.get();
    }

    private static void composingFunction() {
        Function<Integer,Integer> intFunction = x -> x + 1;
        Function<Integer,Integer> intFunction1 = x -> x * 2;

        Integer fog = intFunction.compose(intFunction1).apply(1);
        System.out.println(fog);


        Function<Integer, Integer> function=x->(x+1)*3;
        Function<Integer, Integer> result = intFunction.andThen(intFunction1);
        Integer apply = result.apply(1);
        System.out.println(apply);
        Integer apply1 = function.andThen(intFunction1).andThen(intFunction).apply(2);
        System.out.println(apply1);


    }


    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T s : list) {
            if (p.test(s)) {
                results.add(s);
            }
        }
        return results;
    }

    private static String processfile() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileUrl));
            String line = reader.readLine();
            System.out.println(line);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String processFile(BufferedReaderProcessor p) throws IOException {


        BufferedReader reader = new BufferedReader(new FileReader(fileUrl));
        return p.process(reader);

       /* BufferedReaderProcessor processor= new BufferedReaderProcessor() {
            @Override
            public String process(BufferedReader reader) throws IOException {
                return reader.readLine();
            }
        };*/
    }

}
