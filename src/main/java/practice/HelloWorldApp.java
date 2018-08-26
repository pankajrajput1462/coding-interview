package practice;

import lombok.Data;

import java.util.concurrent.*;

/**
 * Simple Java program to demonstrate how to use Callable and Future class in
 * Java. You can use FutureTask for asynchronous processing.
 *
 * @author WINDOWS 8
 */
public class HelloWorldApp {

    public static void main(String... args) throws InterruptedException, ExecutionException {

        // creating thread pool to execute task which implements Callable
        ExecutorService es = Executors.newSingleThreadExecutor();

        System.out.println("submitted callable task to calculate factorial of 10");
        FactorialCalculator task1 = new FactorialCalculator(10);
        Future<Long> result10 = es.submit(task1);

        System.out.println("submitted callable task to calculate factorial of 15");
        FactorialCalculator task2 = new FactorialCalculator(15);
        Future<Long> result15 = es.submit(task2);

        System.out.println("submitted callable task to calculate factorial of 20");
        FactorialCalculator task3 = new FactorialCalculator(20);
        Future<Long> result20 = es.submit(task3);


        System.out.println("Calling get method of Future to fetch result of factorial 10");
        long factorialof10 = 0;
        if (result10.isDone()) {
            factorialof10 = result10.get();
            System.out.println("factorial of 10 is : " + factorialof10);
        }

        System.out.println("Calling get method of Future to get result of factorial 15");
        if (result15.isDone()) {
            long factorialof15 = result15.get();
            System.out.println("factorial of 15 is : " + factorialof15);
        }

        System.out.println("Calling get method of Future to get result of factorial 20");

        long factorialof20 = 0;
        try {
            factorialof20 = result20.get(1000, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            System.out.println("Time out error");
        }
        System.out.println("factorial of 20 is : " + factorialof20);

        es.shutdown();
    }

}

class FactorialCalculator implements Callable<Long> {
    private int number;

    public FactorialCalculator(int number) {
        this.number = number;
    }

    @Override
    public Long call() throws Exception {
        return factorial(number);
    }

    private long factorial(int n) throws InterruptedException {
        long result = 1;
        while (n != 0) {
            result = n * result;
            n = n - 1;
            Thread.sleep(100);
        }

        return result;
    }

}
