package collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListSample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add("pan" + i);
        }
        // list.forEach(System.out::println);
        //If you will use Iterator then it wil throw concurrent modification exception
        //  Iterator<String> listIterator = list.listIterator();
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String string = (String) listIterator.next();
            System.out.println(string);
            if (string.equals("pan5")) {
                listIterator.add("new");
            }
            if (string.endsWith("7")) {
                listIterator.remove();
            }
        }

        list.forEach(System.out::println);
        System.out.println(list.get(6));

    }

}
