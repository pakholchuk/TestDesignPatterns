package com.pakholchuk.testdesignpatterns.decorator;

public abstract class Pizza {
    protected String name = "Plain pizza";
    String getName(){
        return name;
    };
    abstract int getWeight();
}
