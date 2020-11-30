package com.github.rinaudosal.designpatterns.behavioral.visitor;

public class PortPart implements CarPart {

    @Override
    public void accept(CarPartVisitor carPartVisitor) {
        carPartVisitor.visit(this);
    }
}
