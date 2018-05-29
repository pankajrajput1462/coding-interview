package core.deepcopy;

public class DeepCopyMain {
	
	

	public static void main(String[] args) {
		
		Person person= new Person("Person-A", "civic");
		System.out.println(person.getName()+" "+person.getCar().getName());
		//clone as deep copy
		try {
			Person scopy= (Person) person.clone();
			scopy.setName("pankaj");
			scopy.getCar().setName("safari");
			System.out.println(scopy.getName()+" "+scopy.getCar().getName());
			System.out.println(person.getName()+" "+person.getCar().getName());
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		
		
		
	}
}
