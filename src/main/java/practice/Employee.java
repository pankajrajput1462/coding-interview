package practice;

import lombok.Builder;
import lombok.Data;

import java.util.Comparator;

@Data
@Builder
public class Employee implements Comparator<Employee> {
    private int empId;
    private String empName;

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmpName().compareTo(o2.getEmpName());
    }
}
