package collections.linkedlist;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class LinkedListAlg {

    private Node head;

    /**
     * Function for detecting loop in linked list
     */
    public boolean isLoop() {
        if (head != null) {

            Node slow_ptr = head;
            Node fast_ptr = head;

            while (slow_ptr != null && fast_ptr != null && fast_ptr.next != null) {
                slow_ptr = slow_ptr.next;
                fast_ptr = fast_ptr.next.next;
                if (slow_ptr == fast_ptr) {
                    log.info("Slow_ptr: {} ,Fast pointer : {}", slow_ptr.getData(), fast_ptr.getData());
                    return true;
                }
                log.info("Slow_ptr: {} ,Fast pointer : {}", slow_ptr.getData(), fast_ptr.getData());
            }
        }
        return false;
    }

    public void addNode(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
}
