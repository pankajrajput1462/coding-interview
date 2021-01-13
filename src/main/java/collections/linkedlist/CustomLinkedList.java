package collections.linkedlist;

import lombok.Data;

@Data
public class CustomLinkedList {
    Node head;

    public void add(int data) {
        Node new_node = new Node(data);
        new_node.next = null;
        if (head == null) {
            head = new_node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
    }
}
