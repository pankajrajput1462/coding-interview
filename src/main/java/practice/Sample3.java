package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.function.DoubleSupplier;

class Coordinate{
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int x;
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class CoordinateTask implements Callable{

    private ArrayBlockingQueue<Coordinate> coordinates;

    public CoordinateTask(ArrayBlockingQueue<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public Map<Coordinate,Integer> call() throws Exception {
        Map<Coordinate,Integer> result= new HashMap<>();
        coordinates.forEach(coordinate -> {
            result.put(coordinate,coordinate.getX()+coordinate.getY());
        });
       /* Coordinate take = coordinates.take();
        DoubleSupplier doubleSupplier = () -> take.getX() + take.getY();*/
        return result;
    }
}

public class Sample3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Coordinate> coordinates1 = Arrays.asList(new Coordinate(3, 5), new Coordinate(4, 6), new Coordinate(5, 7));
        ArrayBlockingQueue<Coordinate> coordinates = new ArrayBlockingQueue<>(10);
        coordinates.addAll(coordinates1);
        CoordinateTask coordinateTask = new CoordinateTask(coordinates);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future submit = executorService.submit(coordinateTask);
        Map<Coordinate,Integer> sum = (Map<Coordinate,Integer>)submit.get();
        System.out.println("sum = " + sum);
        executorService.shutdown();
    }
}
