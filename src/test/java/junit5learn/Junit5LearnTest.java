package junit5learn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Junit5LearnTest {
    @BeforeEach
     void runBeforeEachTest(){
        System.out.println("I am running before each test");
    }
    @Test
    public void helloJUnit5() {
        assertEquals(10, 5+5);
    }

}
