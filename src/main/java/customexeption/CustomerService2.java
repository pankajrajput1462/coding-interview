package customexeption;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerService2 {

	public void analyze(List<String> data) {

		if (data.size() > 50) {
			throw new ListTooLargeException("List can't exceed 50 items!");
		}

	}

	public static void main(String[] args) {

		CustomerService2 obj = new CustomerService2();

		// create 100 size
		List<String> data = new ArrayList<String>(Collections.nCopies(100, "mkyong"));

		obj.analyze(data);

	}
}