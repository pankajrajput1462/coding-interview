package customexeption;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomerService {

	public Customer findByName(String name) throws NameNotFoundException {

		if ("".equals(name)) {
			throw new NameNotFoundException("Name is empty!");
		}else if(name.contains("pa")) {
			throw new NameFormatException("Name contains pa");
		}

		return new Customer(name);

	}

	public static void main(String[] args) {

		CustomerService obj = new CustomerService();

		try {

			Customer cus = obj.findByName("pankaj");

		} catch (NameFormatException e) {
			log.info("Name Not : {}",e.getMessage());

		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}

		try {
			final Customer pankaj = obj.findByName("");
			System.out.println("pankaj = " + pankaj.toString());
		} catch (NameNotFoundException e) {
			log.info("Name format  : {}",e.getMessage());
		}

	}
}