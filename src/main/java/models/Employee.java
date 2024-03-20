package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private int empId;
    private String employeeName;
    private String mobNumber;
    private String country;
}
