package com.github.rinaudosal.designpatterns.structural.decorator;

public class VoidSandwich implements Sandwich {
    @Override
    public String make() {
        return "Bread";
    }
}
