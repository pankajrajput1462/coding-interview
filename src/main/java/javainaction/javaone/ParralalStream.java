package javainaction.javaone;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParralalStream {

	public static int doubleIt(int num) {
		System.out.println("Name of current thread: " + Thread.currentThread());
		return num * 2;

	}

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 4, 5, 5, 6, 7, 8, 8, 7);
		// System.out.println(numbers.stream().map(ParralalStream::doubleIt).reduce(0,
		// Integer::sum));
		System.out.println(numbers.parallelStream().map(ParralalStream::doubleIt).reduce(0, Integer::sum));

		Map<Integer, String> map = new HashMap<>();
		map.put(9, "kkk");
		map.put(4, "iik");
		map.put(3, "999k");
		map.forEach((Integer,String)->System.out.println(Integer+" "+String));
		map.replaceAll((Integer,String)->String.toUpperCase());
		map.forEach((Integer,String)->System.out.println(Integer+" "+String));
	}

}
