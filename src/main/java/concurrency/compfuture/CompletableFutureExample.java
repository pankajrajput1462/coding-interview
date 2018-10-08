package concurrency.compfuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

/**
 * https://dotnetcodr.com/2016/12/04/getting-a-result-from-a-parallel-task-in-java-using-completablefuture/
 */
interface CalculationService {
    int calculate(int first,int second);
}

class AdditionService implements CalculationService{

    @Override
    public int calculate(int first, int second) {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return first+second;
    }
}
 class SubtractionService implements CalculationService
{

    @Override
    public int calculate(int first, int second)
    {
        try
        {
            Thread.sleep(2000);
        } catch (InterruptedException ex)
        {
            //ignore
        }
        return first - second;
    }
}

 class MultiplicationService implements CalculationService
{
    @Override
    public int calculate(int first, int second)
    {
        try
        {
            Thread.sleep(3000);
        } catch (InterruptedException ex)
        {
            //ignore
        }
        return first * second;
    }
}

 class DivisionService implements CalculationService
{
    @Override
    public int calculate(int first, int second)
    {
        try
        {
            Thread.sleep(4000);
        } catch (InterruptedException ex)
        {
            //ignore
        }
        return first / second;
    }
}

class  CalculationSupplier implements Supplier<Integer> {

    private CalculationService service;
    private int firstOp;
    private int secOp;

    public CalculationSupplier(CalculationService service, int firstOp, int secOp) {
        this.service = service;
        this.firstOp = firstOp;
        this.secOp = secOp;
    }

    @Override
    public Integer get() {
        return service.calculate(firstOp,secOp);
    }
}

public class CompletableFutureExample{
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        CalculationService additionService = new AdditionService();
        CalculationService multiplicationService = new MultiplicationService();
        CalculationService divisionService = new DivisionService();
        CalculationService subtractionService = new SubtractionService();
        int firs=6;
        int sec=4;
        CompletableFuture<Integer> addCompletableFuture =
                CompletableFuture.supplyAsync(new CalculationSupplier(additionService, firs, sec), cachedThreadPool);
        CompletableFuture<Integer> subCompletableFuture =
                CompletableFuture.supplyAsync(new CalculationSupplier(subtractionService, firs, sec), cachedThreadPool);
        CompletableFuture<Integer> mulCompletableFuture =
                CompletableFuture.supplyAsync(new CalculationSupplier(multiplicationService, firs, sec), cachedThreadPool);
        CompletableFuture<Integer> divCompletableFuture =
                CompletableFuture.supplyAsync(new CalculationSupplier(divisionService, firs, sec), cachedThreadPool);
        List<CompletableFuture<Integer>> allTasks = new ArrayList<>();
        allTasks.add(addCompletableFuture);
        allTasks.add(subCompletableFuture);
        allTasks.add(mulCompletableFuture);
        allTasks.add(divCompletableFuture);

        for (CompletableFuture<Integer> task : allTasks)
        {
            task.whenComplete((result, exception)
                    ->
            {
                if (exception == null)
                {
                    System.out.println("Result: "+result);
                } else
                {
                    task.completeExceptionally(exception);
                    System.out.println(exception.getMessage());
                }
            });
        }

        cachedThreadPool.shutdown();
    }
}