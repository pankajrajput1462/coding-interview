package collections.random;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.concurrent.*;

@Slf4j
public class RandomCollectionsLearn {
    public static void main(String[] args) {

        arrayListDetails();
        linkedListDetails();
        hashMapDetails();
        hashSetDetails();
        treeSetDetails();
        linkedHashmapDetails();
        linkedHashSetDetails();
        priorityQueueDetails();
        arrayBlockingQueueDetails();
        priorityBlockingQueueDetails();
        linkedBlockingQueueDtails();
        arrayBlockingDequeueDetails();


    }

    private static void arrayBlockingDequeueDetails() {
        final BlockingDeque arrayBlockingDueue = new LinkedBlockingDeque();

    }

    private static void linkedBlockingQueueDtails() {
        final BlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
    }

    private static void priorityBlockingQueueDetails() {
        final BlockingQueue priorityBlockingQueue = new PriorityBlockingQueue<>(10);
    }

    private static void arrayBlockingQueueDetails() {
        final BlockingQueue arrayBlockingQueue = new ArrayBlockingQueue<>(10);
    }

    private static void priorityQueueDetails() {
        final Queue<String> priorityQueue = new PriorityQueue<>();
    }

    private static void linkedHashSetDetails() {
        final LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();
    }

    private static void linkedHashmapDetails() {
        final LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    }

    private static void treeSetDetails() {
        final TreeSet<Object> treeSet = new TreeSet<>();
    }

    private static void hashSetDetails() {
        final HashSet<String> hashSet = new HashSet<>();
    }

    private static void hashMapDetails() {
        final Map<String, String> hashMap = new HashMap<>();

    }

    private static void linkedListDetails() {
        final LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("66");
        linkedList.offer("55");
        linkedList.add(null);
        linkedList.offer(null);
        linkedList.push("ooo");
        linkedList.push("ii");
        log.info("Get: Examine {}",linkedList.get(1));
        log.info("Peek: Examine {}",linkedList.peek());
        log.info("Element: Examine {}",linkedList.element());
        linkedList.forEach(System.out::println);
        final String poll = linkedList.poll();
        log.info("Poll: Delete {}", poll);
        final String pop = linkedList.pop();
        log.info("Pop: Delete {}", pop);
        final String remove = linkedList.remove();
        log.info("Remove: Delete {}", remove);

        linkedList.forEach(System.out::println);
    }

    private static void arrayListDetails() {
        final ArrayList<Object> arrayList = new ArrayList<>();
    }
}
