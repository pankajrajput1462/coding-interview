package collections.linkedlist;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListAlgorithmTest {

    @BeforeEach
    public void setUp() throws Exception {
    }

    @Test
    public void isLoop() {
        CustomLinkedList nodeList = new CustomLinkedList();
        nodeList.add(55);
        nodeList.add(20);
        nodeList.add(4);
        nodeList.add(15);
        nodeList.add(10);
        LinkedListAlgorithm algorithm = new LinkedListAlgorithm();
        /*Create loop for testing */
//        nodeList.getHead().next.next.next.next = nodeList.getHead();
//        System.out.println("nodeList.isLoop() = " + algorithm.isLoop());
        System.out.println("Middle Element = " + algorithm.getMiddleElement(nodeList.getHead()));
//        System.out.println("nth Element = " + algorithm.printNthFromTheLast(nodeList.getHead(), 1));
    }
}