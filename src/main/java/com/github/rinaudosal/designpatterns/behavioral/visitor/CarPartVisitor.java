package com.github.rinaudosal.designpatterns.behavioral.visitor;

/**
 * Base visitor interface, for each new object it's necessary add the visit method.
 * <p>
 * By default for the visitor pattern we have a specific visit method to separate the logic into the implementations
 */
public interface CarPartVisitor {

    void visit(OilPart oilPart);

    void visit(PortPart portPart);

    void visit(WheelPart wheelPart);

    void visit(MultipleCarParts multipleCarParts);
}
