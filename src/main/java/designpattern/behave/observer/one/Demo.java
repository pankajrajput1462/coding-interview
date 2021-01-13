package designpattern.behave.observer.one;

import lombok.SneakyThrows;

public class Demo {
    @SneakyThrows
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenEventListenerImpl("file.txt"));
        editor.events.subscribe("open", new LogOpenEventListenerImpl("file2.txt"));
        editor.events.subscribe("open", new LogOpenEventListenerImpl("file3.txt"));
        editor.events.subscribe("save", new EmailEventListenerImpl("saurav@gmail.com"));
        editor.events.subscribe("save", new EmailEventListenerImpl("pankaj@gmail.com"));
        editor.events.subscribe("save", new EmailEventListenerImpl("Nitesh@gmail.com"));

        editor.openFile("some.txt");
        editor.saveFile();
    }
}
