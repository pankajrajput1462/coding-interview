package designpattern.behave.observer.one;

import java.io.File;

public class LogOpenEventListenerImpl implements EventListener {
    private final File fileNameLog;

    public LogOpenEventListenerImpl(String fileNameLog) {
        this.fileNameLog = new File(fileNameLog);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + fileNameLog + ": Someone has performed "
                + eventType + " operation with the following file: " + file.getName());
    }
}
