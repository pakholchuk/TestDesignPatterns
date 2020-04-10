package com.pakholchuk.testdesignpatterns.decorator;

public class Olives extends SimpleDecorator {
    Pizza pizza;

    public Olives(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getName() {
        return pizza.getName() + " with olives";
    }

    @Override
    int getWeight() {
        return pizza.getWeight() + 20;
    }
}
