package concurrency.locks.condition;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Consumer implements Runnable {
    private Set<String> seenObjects = new HashSet();
    private int total = 0;
    private SharedFiFoQueue sharedFiFoQueue;

    public Consumer(SharedFiFoQueue sharedFiFoQueue) {
        this.sharedFiFoQueue = sharedFiFoQueue;
    }

    @Override
    public void run() {
        do {
            final String remove = sharedFiFoQueue.remove();
            if (Objects.nonNull(remove) || remove.isEmpty()) {
                if (!seenObjects.contains(remove)) {
                    ++total;
                    seenObjects.add(remove);
                }
            } else {
                break;
            }
            System.out.println("[Consumer] Read the element  = " + remove);
        } while (true);
        System.out.println("[Consumer] total distinct word read  = "+total);
    }

}
