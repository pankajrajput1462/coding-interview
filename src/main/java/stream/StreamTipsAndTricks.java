package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * Group By link {<a href="https://howtodoinjava.com/java/stream/collectors-groupingby/">...</a>}
 */
public class StreamTipsAndTricks extends StaticData {

    public Map<String, Integer> getMap(String[] list) {
        return Arrays.stream(list)
                .collect(toMap(Function.identity(), String::length));


    }

    public Map<String, List<String>> getMapWithDuplicateKey(String[] list) {

//        return listMap;


        return null;
    }

    public List<String> sortByLengthOptimized(String[] list) {
        return Arrays.stream(list)
                .collect(toMap(Function.identity(), String::length))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .peek(stringIntegerEntry -> System.out.println(stringIntegerEntry.getKey()))
                .map(Map.Entry::getKey).toList();
    }

    /*
      1. grouping all the persons by department.
     */
    public Map<Department, List<Person>> groupBySimpleCondition() {
        return persons.stream()
                .collect(groupingBy(Person::department));
    }

    /*
    collect only the person ids in all departments
     */

    public Map<Department, List<Integer>> groupBySimpleConditionForId() {
        return persons.stream()
                .collect(groupingBy(Person::department,
                        Collectors.mapping(Person::id, Collectors.toList())));
    }

    /* Complex group by
     * group on distinct departments and salary pairs
     */
    public Map<Pair, List<Integer>> distinctDepartmentsSalaryPairs() {
        return persons.stream().collect(groupingBy(person -> new Pair(person.salary(),
                        person.department()),
                mapping(Person::id, toList())));
    }

    /*
     counting all the persons in a department.
     */
    public Map<Department, Long> allPersonInDepartment() {
        return persons.stream().collect(groupingBy(Person::department, counting()));
    }

    public Map<Department, Double> allPersonInDepartmentAvgSalary() {
        return persons.stream().collect(groupingBy(Person::department, averagingDouble(Person::salary)));
    }

    public Map<Department, Optional<Person>> allPersonInDepartmentMaxSalary() {
        return persons.stream().collect(groupingBy(Person::department, maxBy(Comparator.comparingDouble(Person::salary))));
    }

    public Map<String, Integer> findDuplicateWordCount(String sentence) {
        String[] strings = sentence.split(" ");
//        Function<String, Integer> stringIntegerFunction = (s) -> {
//            System.out.println("s = " + s);
//            return 1;
//        };
        return Arrays.stream(strings).collect(toMap(Function.identity(), s -> 1, Math::addExact));
    }

    public TreeSet<Person> removeDuplicatesFromList(final List<Person> employees) {
        return employees.stream().collect(toCollection(() -> new TreeSet<>(Comparator.comparing(Person::name))));
    }

    public TreeSet<Person> removeDuplicatesFromListWay2(final List<Person> employees) {
        Set<String> treeSet = new HashSet<>();
        persons.removeIf(person -> !treeSet.add(person.name()));
        return null;
    }
}
