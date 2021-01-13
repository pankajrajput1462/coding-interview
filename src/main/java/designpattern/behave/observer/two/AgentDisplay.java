package designpattern.behave.observer.two;

public class AgentDisplay implements Observer {
    @Override
    public void update(String message) {
        System.out.print("Agent Display = " + message);
    }
}
