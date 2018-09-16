package collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class HeapsMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(55);
        queue.add(4);
        queue.add(4);
        queue.add(6);
        queue.add(4);
        queue.forEach(System.out::println);
    }
}
