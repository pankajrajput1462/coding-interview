package iq.linkedlist;

import iq.model.Node;

public class LinkedListAlgo {

    private Node head;
    private int count;

    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
        count++;
    }

    public boolean findLoop(Node node) {
        if (node == null) {
            return false;
        }
        Node slow = node;
        Node fast = node.getNext();

        while (slow != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println("Data = " + current.getData());
            current = current.getNext();
        }
    }

    public int size() {
        return count;
    }

    public int findNthNodeFromLast(int num) {
        Node slow = head;
        Node fast = head;
//        moving fast ahead by n, to make gap
        for (int i = 0; i < num; i++) {
            fast = fast.getNext();
        }


// when the fast reaches end, slow will be the nth node from end
        while (fast != null) {
            slow = slow.getNext();
            fast = fast.getNext();

        }
        assert slow != null;
        System.out.println("nth "+num +" > "+ slow.getData());
        return slow.getData();
    }
}
