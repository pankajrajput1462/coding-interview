package designpattern.behave.observer.one;

import java.io.File;

public class EmailEventListenerImpl implements EventListener {
    private final String email;

    public EmailEventListenerImpl(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType +
                " operation with the following file: " + file.getName());
    }
}
