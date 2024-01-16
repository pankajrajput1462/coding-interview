package concurrency.synckeyword;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class SynKeywordTest {


    @Test
    public void withoutSync() throws InterruptedException {
        SynKeyword summation = new SynKeyword();
        ExecutorService service = Executors.newFixedThreadPool(3);

        IntStream.range(0, 100000)
                .forEach(count -> service.submit(summation::calculate));
        service.awaitTermination(1000, TimeUnit.MILLISECONDS);

        assertNotEquals(1000, summation.getSum());
    }

    @Test
    public void withSync() throws InterruptedException {
        SynKeyword summation = new SynKeyword();
        ExecutorService service = Executors.newFixedThreadPool(3);

        IntStream.range(0, 1000)
                .forEach(count -> service.submit(summation::calculateSync));
        service.awaitTermination(1000, TimeUnit.MILLISECONDS);

        assertEquals(1000, summation.getSum());
    }

}