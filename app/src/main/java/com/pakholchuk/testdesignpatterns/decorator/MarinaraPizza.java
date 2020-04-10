package com.pakholchuk.testdesignpatterns.decorator;

public class MarinaraPizza extends Pizza {
    public MarinaraPizza() {
        name = "Pizza Marinara";
    }

    @Override
    int getWeight() {
        return 500;
    }
}
