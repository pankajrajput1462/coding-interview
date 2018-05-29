package javaone;

import java.util.Arrays;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;
import java.util.List;

public class ComparatorMain {

	public List<Person> createPerson() {

		return Arrays.asList(new Person(55, "Pankaj"), new Person(88, "Saurav"), new Person(66, "Sid"),
				new Person(8, "Nitesh"),new Person(8, "Nitesh"));

	}

	public static void printSorted(List<Person> list, Comparator<Person> comparator) {

		list.stream().sorted(comparator).forEach(System.out::println);
		
	}

	public static void main(String[] args) {

		List<Person> createPerson = new ComparatorMain().createPerson();
		//printSorted(createPerson, comparing(Person::getId));
		//printSorted(createPerson, comparing(Person::getId).thenComparing(Person::getName));
		System.out.println(createPerson.stream().collect(groupingBy(Person::getId)));
		System.out.println(createPerson.stream().collect(groupingBy(Person::getId,mapping(Person::getName, toList()))));
	}

}
