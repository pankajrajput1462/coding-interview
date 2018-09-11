package designPattern.behave.observer;

public interface Topic {
    void register(Observer observer);

    void notifyObservers(String line);
}
