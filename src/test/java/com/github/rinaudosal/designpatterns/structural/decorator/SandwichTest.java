package com.github.rinaudosal.designpatterns.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SandwichTest {

    @Test
    void sandwichDecoratorsShouldWorks() {
        Sandwich sandwich = new DressingSandwichDecorator(new MeatSandwichDecorator(new VoidSandwich()));

        assertThat(sandwich.make()).isEqualTo("Bread + Meat + Ketchup");

    }
}
