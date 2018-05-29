package java8;

interface Samplefunctional{
	int sum(int a,int b);
}

public class MainTest {

	
	public static void main(String[] args) {
		System.out.println("dfsdf");
		int i = sampleSum(4, 6, (a, b) -> a + b);
		System.out.println(i);
	}

	public  static int sampleSum(int a, int b,Samplefunctional samplefunctional){
		return samplefunctional.sum(a,b);
	}

}
