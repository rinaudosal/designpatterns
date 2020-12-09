package com.github.rinaudosal.designpatterns.structural.decorator;

public class MeatSandwichDecorator extends SandwichDecorator {
    public MeatSandwichDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addMeat();
    }

    public String addMeat() {
        return " + Meat";
    }
}
