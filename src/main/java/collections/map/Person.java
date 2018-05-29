package collections.map;

import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class Person {
    private int id;
    private String emp_name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(emp_name, person.emp_name);
    }

    @Override
    public int hashCode() {

        //return Objects.hash(id, emp_name);
        return 5;
    }
}
