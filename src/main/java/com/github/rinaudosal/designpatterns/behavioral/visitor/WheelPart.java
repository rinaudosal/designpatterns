package com.github.rinaudosal.designpatterns.behavioral.visitor;

public class WheelPart implements CarPart {
    @Override
    public void accept(CarPartVisitor carPartVisitor) {
        carPartVisitor.visit(this);
    }
}
