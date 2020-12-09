package com.github.rinaudosal.designpatterns.structural.decorator;

public class DressingSandwichDecorator extends SandwichDecorator {
    public DressingSandwichDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addDressing();
    }

    public String addDressing() {
        return " + Ketchup";
    }
}
