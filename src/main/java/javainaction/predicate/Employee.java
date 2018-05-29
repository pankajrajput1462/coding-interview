package javainaction.predicate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int id;
    private  int age;
    private String gender;
    private String  firstName;
    private String lastName;
}
