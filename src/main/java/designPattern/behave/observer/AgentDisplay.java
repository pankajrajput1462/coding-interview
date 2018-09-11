package designPattern.behave.observer;

public class AgentDisplay implements Observer {
    @Override
    public void update(String message) {
        System.out.print("Agent Display = " + message);
    }
}
