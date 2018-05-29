package javainaction.javaone;

import java.util.List;
import static java.util.stream.Collectors.*;

public class Java8Feature {

	public void joinString(List<String> list) {
		String collect = list.stream().map(String::toUpperCase).collect(joining(","));
		System.out.println(collect);
		
	}
}
