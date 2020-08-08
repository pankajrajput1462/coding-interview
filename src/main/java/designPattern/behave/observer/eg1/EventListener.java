package designPattern.behave.observer.eg1;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
