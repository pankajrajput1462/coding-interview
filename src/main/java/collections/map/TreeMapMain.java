package collections.map;

import models.Employee;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMain {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "three");
        treeMap.put(2, "two");
        treeMap.put(1, "one");
        treeMap.put(5, "five");
        treeMap.put(4, "four");
        treeMap.forEach((integer, string) -> System.out.println(integer + " > " + string));
        System.out.println((int) 'A');
        System.out.println((int) 'Z');
        System.out.println((int) 'a');
        System.out.println((int) 'z');

        TreeMap<Employee, Integer> map = new TreeMap<>(Comparator.comparingInt(Employee::getEmpId));
        map.put(new Employee(4, "Pankaj", "808089", "India"), 23);
        map.put(new Employee(2, "Singh", "83809", "USA"), 23);
        map.put(new Employee(0, "Rajput", "8038089", "Brazil"), 23);
        System.out.println("map = " + map);

        Comparator<Employee> employeeComparator= Comparator.comparing(Employee::getEmployeeName);

        System.out.println("map = " + map);
    }
}
