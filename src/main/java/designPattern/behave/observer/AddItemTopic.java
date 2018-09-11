package designPattern.behave.observer;

import java.util.ArrayList;
import java.util.List;

public class AddItemTopic implements Topic {

    List<Observer> addItemObs = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        addItemObs.add(observer);
    }

    @Override
    public void notifyObservers(String line) {
        addItemObs.stream().forEach(observer -> observer.update(line));
    }
}
