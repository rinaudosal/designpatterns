package ch.codeway.sirius.designpattern.behavioral.interpreter;

/**
 * Base interface to describe Interpreter Pattern
 */
public interface Expression {

    /**
     * Base method for interpret string context
     *
     * @param context message to interpret
     * @return true or false concrete condition
     */
    boolean interpret(String context);
}
