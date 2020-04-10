package com.pakholchuk.testdesignpatterns.factory;

public class ToyotaFactory extends CarFactory{
    @Override
    Car constructCar(String type) {
        switch (type) {
            case "Land Cruiser":
                return new ToyotaLandCruiser();
            case "Innova":
                return new ToyotaInnova();
            case "Fortuner":
                return new ToyotaFortuner();
            default:
                return null;
        }
    }
}
