package practice;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeMain {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();
        Employee employee1 = Employee.builder().empId(34).empName("Pankaj").build();
        Employee employee2 = Employee.builder().empId(14).empName("Singh").build();
        Employee employee3 = Employee.builder().empId(6).empName("Rajput").build();
        arrayList.add(employee1);
        arrayList.add(employee2);
        arrayList.add(employee3);
//        Object[] objects = arrayList.toArray();
//        Arrays.sort(objects);
//        Arrays.stream(objects).forEach(employee -> {
//            System.out.println("employee = " + employee);
//        });
//        arrayList.stream()
//                .sorted(Comparator.comparingInt(Employee::getEmpId))
//                .forEach(employee -> System.out.println("employee = " + employee));
//        arrayList.stream()
//                .sorted(Comparator.comparing(Employee::getEmpName).reversed())
//                .forEach(employee -> System.out.println("Names = " + employee));
//        Collections.sort(arrayList, );
    }
}
