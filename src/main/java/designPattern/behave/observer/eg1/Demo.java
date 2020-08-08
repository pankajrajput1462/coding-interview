package designPattern.behave.observer.eg1;

import lombok.SneakyThrows;

public class Demo {
    @SneakyThrows
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenEventListenerImpl("file.txt"));
        editor.events.subscribe("save", new EmailEventListenerImpl("pankaj@gmail.com"));

        editor.openFile("some.txt");
        editor.saveFile();
    }
}
