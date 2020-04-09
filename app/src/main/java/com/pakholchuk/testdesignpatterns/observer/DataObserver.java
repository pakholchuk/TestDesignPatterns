package com.pakholchuk.testdesignpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class DataObserver implements Observer {

    private String data;

    @Override
    public void update(Observable o, Object arg) {
        data = (String) arg;
    }

    String getDataFromObserver() {
        return data;
    }
}
