package com.github.rinaudosal.designpatterns.behavioral.state;

/**
 * Abstract Class that are extended of all ConcreteStates developed
 */
public interface State {

    /**
     * Generic method to request to change The State
     */
    void handleRequest();
}
