package com.pakholchuk.testdesignpatterns.decorator;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Cheese Pizza";
    }
    @Override
    int getWeight() {
        return 400;
    }
}
