package designPattern.struct.adaptor;

public class AdapterDemoSquarePeg {

	public static void main(String[] args) {
		RoundHole hole = new RoundHole(8);
		SquarePegAdapter adapter;
		for (int i = 6; i < 10; i++) {
		
			adapter = new SquarePegAdapter((double)i);
			adapter.makeFit(hole); // Client uses the new Interface
		}
	}
	
}
