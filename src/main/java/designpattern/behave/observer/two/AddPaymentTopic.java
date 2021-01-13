package designpattern.behave.observer.two;

import java.util.ArrayList;
import java.util.List;

public class AddPaymentTopic implements Topic {

    List<Observer> addPaymentObs = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        addPaymentObs.add(observer);
    }

    @Override
    public void notifyObservers(String line) {
        addPaymentObs.stream().forEach(observer -> observer.update(line));
    }
}
