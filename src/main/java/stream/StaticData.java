package stream;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

record Person(int id, String name, double salary, Department department) {
}

record Department(int id, String name) {
}

@Data
@AllArgsConstructor
class Pair {
    private double salary;
    private Department department;
}

public class StaticData {
    public static List<Person> persons = List.of(
            new Person(1, "Alex", 100d, new Department(1, "HR")),
            new Person(2, "Brian", 200d, new Department(1, "HR")),
            new Person(3, "Charles", 900d, new Department(2, "Finance")),
            new Person(4, "David", 200d, new Department(2, "Finance")),
            new Person(5, "Edward", 200d, new Department(2, "Finance")),
            new Person(6, "Frank", 800d, new Department(3, "ADMIN")),
            new Person(7, "George", 900d, new Department(3, "ADMIN")),
            new Person(8, "Alex", 933d, new Department(5, "OPS")),
            new Person(9, "David", 700d, new Department(4, "OPS"))

    );
}
