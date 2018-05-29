package javaone.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Sample implements Comparator<Integer>	
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	}

public class JavaCollections8 {

	public static void main(String[] args) {
		List<String> asList = Arrays.asList("pankah","dfsdfs","fgdfg");
		asList.forEach(System.out::println);
		//asList.removeIf(str->str.startsWith("p"));
		asList.replaceAll(String::toUpperCase);
		asList.forEach(System.out::println);
		
		
	}
	
}
