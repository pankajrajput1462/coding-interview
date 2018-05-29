package javainaction.javaone;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapFunction {

	public static int compute(int a) {
		return (int) Math.sqrt(a);
		
	}
	
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.putIfAbsent(9, compute(8));
		
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
