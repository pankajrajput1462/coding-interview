package practice;

import java.util.concurrent.*;


 class DemoThread implements Runnable
{
    private String name = null;

    public DemoThread(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void run() {
        try {
            System.out.println("Before sleep : " + name);
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("After sleep : " + name);
    }
}


public class PoolPractice {

    public static void main(String[] args) {
        Integer threadCount=0;
        LinkedBlockingQueue<Runnable> queue= new LinkedBlockingQueue<>();

        ThreadPoolExecutor threadPoolExecutor= new ThreadPoolExecutor(256,256,
                60,TimeUnit.SECONDS,queue);
        threadPoolExecutor.setRejectedExecutionHandler((r, executor) -> {
            System.out.println("Demo Task rejected = " + ((DemoThread)r).getName());
        });
        while (threadCount<500){
            threadCount++;
            if (threadPoolExecutor.getQueue().remainingCapacity()==0){
                break;
            }
            //adding threads one by one
            threadPoolExecutor.submit(new DemoThread(threadCount.toString()));
        }
        threadPoolExecutor.shutdown();
    }
}
