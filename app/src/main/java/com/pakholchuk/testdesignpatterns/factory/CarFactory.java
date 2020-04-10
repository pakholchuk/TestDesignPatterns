package com.pakholchuk.testdesignpatterns.factory;

public abstract class CarFactory {
    public Car orderCar(String type){
        Car car;
        car = constructCar(type);
        return car;
    }
    abstract Car constructCar(String type);

}
