package practice;

public class ThreadPool {

    CustomBlockingQueue<Runnable> queue;

    public ThreadPool(int queueSize, int nThread) {
            queue=new CustomBlockingQueue<>();
    }

}
