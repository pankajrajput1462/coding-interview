package pan.comparator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComparatorMainTest {

    List<Human> humans;

    @BeforeEach
    public void setUp() {

        humans = Arrays.asList(new Human("Sarah", 12),
                new Human("Linc", 10),
                new Human("Pankaj", 1),
                new Human("Pankaj", 12),
                new Human("Zack", 1),
                new Human("Linc", 12),
                new Human("pankaj", 8));


    }

    @Test
    public void givenComposition_WhenSortingEntiesNameTo() {
        humans.sort(Comparator.comparing(Human::getName).thenComparing(Human::getI));
        humans.forEach(System.out::println);
        assertEquals(8, humans.get(humans.size()-1).getI());
    }
}
