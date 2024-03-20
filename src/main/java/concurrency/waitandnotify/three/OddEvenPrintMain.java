package concurrency.waitandnotify.three;

import lombok.extern.slf4j.Slf4j;

public class OddEvenPrintMain {

    public static void main(String... args) {
        Printer print = new Printer();
        Thread t1 = new Thread(new EvenOddWorker(print, 20, false));
        Thread t2 = new Thread(new EvenOddWorker(print, 20, true));
        t1.start();
        t2.start();
    }

}

@Slf4j
class EvenOddWorker implements Runnable {

    private final int max;
    private final Printer print;
    private final boolean isEvenNumber;

    EvenOddWorker(Printer print, int max, boolean isEvenNumber) {
        this.print = print;
        this.max = max;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {
        try {
            int number = isEvenNumber ? 2 : 1;
            while (number <= max) {
                if (isEvenNumber) {
                    print.printEven(number);
                } else {
                    print.printOdd(number);
                }
                number += 2;
            }
        } catch (InterruptedException e) {
            log.error(e.getMessage());
        }

    }

}

@Slf4j
class Printer {
    boolean isOdd = false;

    synchronized void printEven(int number) throws InterruptedException {

        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                log.error(e.getMessage());
                throw new InterruptedException();
            }
        }
        System.out.println("Even: " + number);
        isOdd = false;
        notifyAll();
    }

    synchronized void printOdd(int number) throws InterruptedException {
        while (isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                log.error(e.getMessage());
                throw new InterruptedException();
            }
        }
        System.out.println("Odd : " + number);
        isOdd = true;
        notifyAll();
    }

}
