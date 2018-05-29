package core.deepcopy;

public class Person implements Cloneable {

	private String name;
	private Car car;

	public Person(String name, String car) {
		this.name = name;
		this.car = new Car(car);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	// Deep copy
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Person person = new Person(name, car.getName());
		return person;
	}
}
