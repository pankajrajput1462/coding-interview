package concurrency.locks;

/**
 * Created by psi143 on 11/8/2016.
 */
public class PrintingJob implements  Runnable {
    public PrintingJob(PrinterQueue printerQueue) {
        this.printerQueue = printerQueue;
    }

    private  PrinterQueue printerQueue;

    @Override
    public void run() {
        System.out.printf("%s: Going to print a document\n", Thread.currentThread().getName());
        printerQueue.printJob(new Object());
    }
}
