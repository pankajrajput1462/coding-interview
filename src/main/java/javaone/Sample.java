package javaone;

import java.util.Arrays;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("pankaj", "saurav", "nitesh");
		new Java8Feature().joinString(list);
		System.out.println(Utils.numberOfCores());
	}
}
