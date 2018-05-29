package java8;

public class NewThingsInJava8 {
	
	private void m1() {
		// TODO Auto-generated method stub
		
		Runnable runale = () ->{System.out.println("lamda" + this);};
		new Thread(runale).start();

	}

	/*void Two()
	{
		Runnable runnable n= 
	}*/
	
	public static void main(String[] args) {
		NewThingsInJava8 inJava8 = new NewThingsInJava8();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("inner class" + this);
			
				
			}
	
		});
		inJava8.m1();
		t1.start();
		
	}
	
}
