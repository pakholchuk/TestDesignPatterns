package com.pakholchuk.testdesignpatterns.decorator;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "Pizza Pepperoni";
    }
    @Override
    int getWeight() {
        return 450;
    }
}
