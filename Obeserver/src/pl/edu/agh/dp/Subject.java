package pl.edu.agh.dp;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        if(observer != null) {
            this.observers.add(observer);
        }
    }

    public void removeObserver(Observer observer) {
        if(observer != null) {
            this.observers.remove(observer);
        }
    }

    public void handleEvent() {
        for(Observer observer: this.observers) {
            observer.notifyMe();
        }
    }
}
