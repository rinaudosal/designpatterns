package com.github.rinaudosal.designpatterns.behavioral.interpreter;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * ConcreteInterpreter class to manage AND expression in input
 */
public class AndExpression implements Expression {

    private final Expression[] expressions;

    /**
     * Constructor with expressions to be interpret in method
     *
     * @param expressions expressions to interpret
     */
    public AndExpression(Expression... expressions) {
        this.expressions = expressions;
    }

    @Override
    public boolean interpret(String context) {
        return Arrays.stream(expressions)
            .map(a -> a.interpret(context))
            .reduce((a, b) -> a && b)
            .orElse(false);
    }
}
