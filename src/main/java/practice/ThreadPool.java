package practice;

import lombok.AllArgsConstructor;

import java.util.Random;
import java.util.concurrent.*;
@lombok.Data
@AllArgsConstructor
class  Data{
    private int x;
    private int y;
}

public class ThreadPool {

    public static void main(String[] args) {

        BlockingQueue <Data> dataList= new ArrayBlockingQueue<>(1110);
        for (int i = 0; i < 500; i++) {
            Random random= new Random();
            Data data = new Data(random.nextInt(), random.nextInt());
            dataList.add(data);
        }

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Callable runnable = () -> {
            long agg = 0;
            try {
                Data take = dataList.take();
                int x = take.getX();
                int y = take.getY();
                agg = sum(x, y) + minus(x, y) + multiply(x, y) + div(x, y);
                return agg;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("agg = " + agg);
            return agg;
        };
        executorService.submit(runnable);
        executorService.shutdown();
    }

    private static int sum(int a, int y){
        return a+y;
    }
    private static int minus(int a, int y){
        return a-y;
    }
    private static int multiply(int a, int y){
        return a*y;
    }
    private static int div(int a, int y){
        return a/y;
    }

}
