package cn.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    //订阅者的列表
    private List<Observer> observers =new ArrayList<Observer>();


    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notify(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
