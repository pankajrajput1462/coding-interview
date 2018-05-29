package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Employee
{
/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emp_add == null) ? 0 : emp_add.hashCode());
		result = prime * result + ((emp_name == null) ? 0 : emp_name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (emp_add == null) {
			if (other.emp_add != null)
				return false;
		} else if (!emp_add.equals(other.emp_add))
			return false;
		if (emp_name == null) {
			if (other.emp_name != null)
				return false;
		} else if (!emp_name.equals(other.emp_name))
			return false;
		return true;
	}*/
	public String emp_name;
	public String emp_add;
	public Employee(String string, String string2) {
		this.emp_add=string;
		this.emp_name=string2;
		
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_add() {
		return emp_add;
	}
	public void setEmp_add(String emp_add) {
		this.emp_add = emp_add;
	}
	
	@Override
	public int hashCode() {
		return 8;
	}
	
}

public class HashCodeTest {

	
	public static void main(String[] args) {
		
		Employee employee1 = new  Employee("panjkaj","india");
		Employee employee2 = new  Employee("kahfksdh","sdfskdhf");
		Employee employee3 = new  Employee("sdvsd","sdfsf");
		Employee employee4 = new  Employee("sdfds","sdsfs");
		
		Map<Employee, String> map = new HashMap<>();
		map.put(employee1, "panmkaj");
		map.put(employee2 ,"asefadf");
		map.put(employee3, "asefsd");
		map.put(employee4, "sd");
		
		Set<Entry<Employee, String>> entrySet = map.entrySet();
		for (Entry<Employee, String> entry : entrySet) {
			System.out.println(entry.getValue());
			
		}
		
	}
	
}
