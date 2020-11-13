package com.github.rinaudosal.designpatterns.behavioral.interpreter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InterpreterTest {

    private Expression target;

    /**
     * I do mannually create a Interpreter tree (note: maybe very complex)
     *
     * @return Expression tree
     */
    private static Expression buildInterpreterTree() {

        Expression lions = new TerminalExpression("Lions");
        Expression tigers = new TerminalExpression("Tigers");
        Expression bears = new TerminalExpression("Bears");

        // Tigers and Bears
        Expression tigersAndBears = new AndExpression(tigers, bears);

        //Lions or (Tigers and Bears)
        Expression lionsOrTigerAndBears = new OrExpression(lions, tigersAndBears);

        // Bears and Lions or (Tigers and Bears)
        return new AndExpression(bears, lionsOrTigerAndBears);
    }

    @BeforeEach
    public void setUp() {
        target = buildInterpreterTree();

    }

    @Test
    public void interpretCorrectlyStrings() {
        Assertions.assertThat(target.interpret("Bears")).isFalse();
        Assertions.assertThat(target.interpret("Tigers")).isFalse();
        Assertions.assertThat(target.interpret("Lions")).isFalse();
        Assertions.assertThat(target.interpret("Tigers Bears")).isTrue();

    }
}
