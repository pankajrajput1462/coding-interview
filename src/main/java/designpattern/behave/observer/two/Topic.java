package designpattern.behave.observer.two;

public interface Topic {
    void register(Observer observer);

    void notifyObservers(String line);
}
