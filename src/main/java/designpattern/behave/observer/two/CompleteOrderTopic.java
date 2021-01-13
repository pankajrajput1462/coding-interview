package designpattern.behave.observer.two;

import java.util.ArrayList;
import java.util.List;

public class CompleteOrderTopic implements Topic {

    List<Observer> completeOrderObs = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        completeOrderObs.add(observer);
    }

    @Override
    public void notifyObservers(String line) {
        completeOrderObs.stream().forEach(observer -> observer.update(line));
    }
}
