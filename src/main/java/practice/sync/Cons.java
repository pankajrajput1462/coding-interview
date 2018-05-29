package practice.sync;

public class Cons implements Runnable {

    private final int MAX_SIZE = 10;

    private int[] list;


    public Cons(int[] list) {
        this.list = list;
    }

    @Override
    public void run() {

        synchronized (this) {
            for (int i = 0; i < MAX_SIZE; i++) {
                System.out.println("list = " + list[i]);
            }
        }
    }
}
