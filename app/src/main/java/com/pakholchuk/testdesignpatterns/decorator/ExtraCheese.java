package com.pakholchuk.testdesignpatterns.decorator;

public class ExtraCheese extends SimpleDecorator {
    Pizza pizza;

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getName() {
        return pizza.getName() + " with extra cheese";
    }

    @Override
    int getWeight() {
        return pizza.getWeight() + 60;
    }
}
