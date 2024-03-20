package concurrency.waitandnotify.five;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderRoundRobinNew {
    public Object[] locks;

    private static class LinePrinterJob implements Runnable {
        private final Object currentLock;


private final Object nextLock;
    BufferedReader bufferedReader = null;

    public LinePrinterJob(String fileToRead, Object currentLock, Object nextLock) {
        this.currentLock = currentLock;
        this.nextLock = nextLock;
        try {
            this.bufferedReader = new BufferedReader(new FileReader(fileToRead));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        /*
         * Few points to be noted:
         * 1. Current thread cannot move ahead to read the line in the file until and unless its immediately previous thread is done as they are supposed to read in round-robin fashion.
         * 2. After current thread is done reading the line it must notify the other thread else that thread will wait forever.
         * */
        String currentLine;
        synchronized(currentLock) {
            try {
                while ( (currentLine = bufferedReader.readLine()) != null) {
                    try {
                        currentLock.wait();
                        System.out.println(currentLine);
                    }
                    catch(InterruptedException e) {}
                    synchronized(nextLock) {
                        nextLock.notify();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        synchronized(nextLock) {
            nextLock.notify(); /// Ensures all threads exit at the end
        }
    }
}

public FileReaderRoundRobinNew(int numberOfFilesToRead) {
    locks = new Object[numberOfFilesToRead];
    int i;
    String fileLocation = "C:\\Users\\psi143\\git\\usecase\\usecase\\src\\main\\java\\concurrency.waitandnotify\\Message.java";
    //Initialize lock instances in array.
    for(i = 0; i < numberOfFilesToRead; ++i) locks[i] = new Object();
    //Create threads
    int j;
    for(j=0; j<(numberOfFilesToRead-1); j++ ){
        Thread linePrinterThread = new Thread(new LinePrinterJob(fileLocation + "Temp" + j,locks[j],locks[j+1]));
        linePrinterThread.start();
    }
    Thread lastLinePrinterThread = new Thread(new LinePrinterJob(fileLocation + "Temp" + j,locks[numberOfFilesToRead-1],locks[0]));
    lastLinePrinterThread.start();
}

public void startPrinting() {
    synchronized (locks[0]) {
        locks[0].notify();
    }
}

public static void main(String[] args) {
    FileReaderRoundRobinNew fileReaderRoundRobin = new FileReaderRoundRobinNew(4);
    fileReaderRoundRobin.startPrinting();
}
}