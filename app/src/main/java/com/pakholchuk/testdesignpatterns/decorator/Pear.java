package com.pakholchuk.testdesignpatterns.decorator;

public class Pear extends SimpleDecorator {
    private Pizza pizza;

    Pear(Pizza pizza) {
        this.pizza = pizza;

    }

    @Override
    String getName() {
        return pizza.getName() + " with pear";
    }

    @Override
    int getWeight() {
        return pizza.getWeight() + 30;
    }
}
