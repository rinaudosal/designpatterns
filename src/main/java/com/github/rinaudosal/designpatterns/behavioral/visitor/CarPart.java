package com.github.rinaudosal.designpatterns.behavioral.visitor;

/**
 * Interface base of Visitor, all elements to implement this pattern must to be implements it
 */
public interface CarPart {

    /**
     * Base method to add a visitor of the object
     *
     * @param carPartVisitor the visitor that want to check it
     */
    void accept(CarPartVisitor carPartVisitor);
}
