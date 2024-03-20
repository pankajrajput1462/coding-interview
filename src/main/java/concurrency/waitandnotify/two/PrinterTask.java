package concurrency.waitandnotify.two;

public class PrinterTask implements Runnable {
    int num = 0;
    BigPrintNum printNum;
    int max;
    int noThreads;
    boolean[] threadStore;

    public PrinterTask(BigPrintNum printNum, int max, boolean[] threadStore, int noThreads) {
        this.printNum = printNum;
        this.max = max;
        this.threadStore = threadStore;
        this.noThreads = noThreads;
    }

    @Override
    public void run() {
        int n = 0;
        for (int i = 0; i < noThreads; i++) {
            if (threadStore[i]) {
                n = i;
                num = i;
            }
        }
        while (num <= max) {
            printNum.print(num, n, noThreads);
            num += noThreads;
        }
    }
}
