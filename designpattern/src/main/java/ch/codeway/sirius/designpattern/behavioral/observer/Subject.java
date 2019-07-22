package ch.codeway.sirius.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject Actor in Observer pattern.
 * This class is the orchestrator of events listened of the State element
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    abstract void setState(String state);

    abstract String getState();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
