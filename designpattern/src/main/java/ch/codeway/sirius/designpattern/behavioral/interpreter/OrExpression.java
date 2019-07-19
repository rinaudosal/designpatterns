package ch.codeway.sirius.designpattern.behavioral.interpreter;

import java.util.stream.Stream;

public class OrExpression implements Expression {
    private Expression[] expressions;

    public OrExpression(Expression... expressions) {
        this.expressions = expressions;
    }

    @Override
    public boolean interpret(String context) {
        return Stream.of(expressions)
            .map(a -> a.interpret(context))
            .reduce((a, b) -> a || b)
            .orElse(false);
    }
}
