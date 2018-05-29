package collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {

		Set<String> hashSet = new HashSet<String>();

		for (int i = 0; i < 10; i++) {
			hashSet.add("One" + i);
		}
		hashSet.forEach(System.out::println);
		System.out.println("-------------------");

		Set<String> treeSet = new TreeSet<String>();
		
		for (int i = 0; i < 10; i++) {
			treeSet.add("One" + i);
		}
		treeSet.forEach(System.out::println);

		
	}

}
