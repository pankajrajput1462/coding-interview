package collections.linkedlist;

import lombok.Data;

/**
 * Node for linked list
 */

@Data
public class Node {

    private int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
