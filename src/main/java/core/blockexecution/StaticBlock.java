package core.blockexecution;

/**
 * Example of Static block and how block will be executed or in which order
 */
public class StaticBlock {
	static int var = 10;
	public static final String NAME = "uuu";

	public StaticBlock() {
		var = 70;
		System.out.println("Constructor: " + var);
	}

	static {
		System.out.println("Static Block :Before changing the value : " + var);
		var = 20;
		System.out.println("Static Block: After changing the value: " + var);
	}

	{
		var = 60;
		System.out.println("Normal Block: " + var);
	}

	public static void main(String[] args) {
		System.out.println("Inside main method :"+var);
		StaticBlock block = new StaticBlock();

	}

}
