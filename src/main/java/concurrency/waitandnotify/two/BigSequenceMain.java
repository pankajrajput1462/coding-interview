package concurrency.waitandnotify.two;

public class BigSequenceMain {
    public static void main(String[] args) {
        BigPrintNum printNum = new BigPrintNum();
        int max = 20;
        int noThreads = 11;
        for (int i = 0; i < noThreads; i++) {
            boolean[] threadStore = new boolean[noThreads];
            threadStore[i] = true;
            Thread t = new Thread(new PrinterTask(printNum, max, threadStore, noThreads));
            t.start();
        }
    }
}

