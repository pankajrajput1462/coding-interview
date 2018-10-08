package collections.linkedlist;

import org.junit.Before;
import org.junit.Test;

public class LinkedListAlgorithmTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void isLoop() {
        LinkedListAlgorithm llist = new LinkedListAlgorithm();
        llist.addNode(55);
        llist.addNode(20);
        llist.addNode(4);
        llist.addNode(15);
        llist.addNode(10);

        /*Create loop for testing */
        llist.getHead().next.next.next.next = llist.getHead();
        System.out.println("llist.isLoop() = " + llist.isLoop());;
    }
}