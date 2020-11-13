package com.github.rinaudosal.designpatterns.behavioral.chain;

/**
 * Abstract class must to be Implemented by all the elements of the Chain
 */
public abstract class RoleHandler {

    /**
     * Every element of the chain knows its successor
     */
    RoleHandler successor;

    public void setSuccessor(RoleHandler successor) {
        this.successor = successor;
    }

    /**
     * Method to magage requests or else call successor
     *
     * @param request the request to process
     */
    public abstract String handleRequest(Request request);

}
