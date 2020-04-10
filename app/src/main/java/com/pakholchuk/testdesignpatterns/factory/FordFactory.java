package com.pakholchuk.testdesignpatterns.factory;

public class FordFactory extends CarFactory {
    Car constructCar(String type) {
        switch (type) {
            case "Focus":
                return new FordFocus();
            case "Mustang":
                return new FordMustang();
            case "F50":
                return new FordF50();
            default:
                return null;
        }
    }
}
