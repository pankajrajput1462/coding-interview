package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashCodeMain {

    public static void main(String[] args) {
        Map map= new HashMap();

        Person person1= new Person(23,"pankaj");
        Person person2= new Person(23,"pa2nkaj");

        map.put(person1,"one");
        map.put(person2,"two");

        System.out.println("map = " + map.size());
    }
}
