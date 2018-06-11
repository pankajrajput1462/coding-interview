package collections.array;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class EmployeeTest {
    @Test
    public void hashSetTest() {
        Employee employee1 = new Employee(1, "pankaj");
        System.out.println("employee1 = " + employee1.hashCode());
        Employee employee2 = new Employee(1, "pankaj");
        System.out.println("employee2 = " + employee2.hashCode());
        Employee employee3 = new Employee(1, "red");
        System.out.println("employee3 = " + employee3.hashCode());
        Set<Employee> set = new HashSet<>();
        set.add(employee1);
        set.add(employee2);
        set.add(employee3);
        System.out.println("set = " + set);
    }
}
