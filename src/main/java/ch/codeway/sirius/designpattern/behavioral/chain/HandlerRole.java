package ch.codeway.sirius.designpattern.behavioral.chain;

/**
 * Abstract class thet must Implement all Element of the Chain
 */
public abstract class HandlerRole {

    /**
     * Every element of the chain knows its successor
     */
    HandlerRole successor;

    HandlerRole(HandlerRole successor) {
        this.successor = successor;
    }

    /**
     * Method to magage requests or else call successor
     *
     * @param request the request to process
     */
    public abstract HandlerRole handleRequest(Request request);

}
