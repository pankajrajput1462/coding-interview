package collections.array;

public class Employee {
    private int id;
    private String emp_name;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", emp_name='" + emp_name + '\'' +
                '}';
    }

    public Employee(int id, String emp_name) {
        this.id = id;
        this.emp_name = emp_name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        return emp_name != null ? emp_name.equals(employee.emp_name) : employee.emp_name == null;
    }

  /*  @Override
    public int hashCode() {
       *//* int result = id;
        result = 31 * result + (emp_name != null ? emp_name.hashCode() : 0);
        return result;*//*
       return 1;
    }*/
}
