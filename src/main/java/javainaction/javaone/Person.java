package javainaction.javaone;

public class Person {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int id;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	private String name;
}
