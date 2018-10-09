package collections.linkedlist;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class LinkedListAlgorithm {

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

    /**
     *Detecting the loop in linked list
     */
    public Node getMiddleElement(Node head){
        Node slow_ptr = head;
        Node fast_ptr = head;
        if (head!=null) {

            while (fast_ptr!=null&& fast_ptr.next!=null){
                slow_ptr=slow_ptr.next;
               fast_ptr= fast_ptr.next.next;
            }
        }
        System.out.println("slow_ptr = " + slow_ptr);
        return slow_ptr;
    }
    /**
     * Print  nth from the last
     */
    Node printNthFromTheLast(Node head, int n){
        int length=0;
        Node temp=head;
        //1.Count the number of nodes in list
        while (temp!=null){
            length++;
            temp=temp.next;
        }
        //2.Check if value is greater then list or not
        if (length<n){
            return null;
        }
        temp=head;
        //3. get the (length-n+1) node
        for (int i = 0; i < length - n + 1; i++) {
            temp=temp.next;
        }
        System.out.println(temp.next);
        return temp;
    }

    /**
     * Add new Node in Linked list
     * @param data
     */
    public void addNode(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
}
