package designpattern.behave.observer.two;

public class CustomerDisplay implements Observer {
    @Override
    public void update(String message) {
        System.out.println(" * Customer Display = " + message);
    }
}
