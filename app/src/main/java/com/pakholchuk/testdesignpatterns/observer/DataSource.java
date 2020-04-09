package com.pakholchuk.testdesignpatterns.observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class DataSource extends Observable {

    private ArrayList<Observer> observers = new ArrayList<>();
    private String data;
    @Override
    public synchronized void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o:
             observers) {
            o.update(this, data);
        }
    }

    void setData(String incoming){
        data = incoming;
    }
}
