package collections.list;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteSample {
    public static void main(String[] args) {
        List<String> list= new CopyOnWriteArrayList<>();
        list.add("pankaj");
        for (String next : list) {
            System.out.println("nexx = " + next);
            if (next.contains("pankaj")) {
                list.remove("pankaj");
            }

        }
        System.out.println("list = " + list);
    }
}
