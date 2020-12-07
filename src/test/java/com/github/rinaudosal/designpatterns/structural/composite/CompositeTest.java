package com.github.rinaudosal.designpatterns.structural.composite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CompositeTest {

    @Test
    void compositeMenuShouldWorks() {
        Menu mainMenu = new Menu("Main", "/main");

        // Compositors
        MenuItem safety = new MenuItem("Safety", "/safety");
        mainMenu.add(safety);

        Menu claims = new Menu("Claims", "/Claims");
        mainMenu.add(claims);

        // Leafs
        MenuItem personalClaims = new MenuItem("Personal", "/personal");
        claims.add(personalClaims);
        MenuItem companyClaims = new MenuItem("Company", "/company");
        claims.add(companyClaims);

        String returnValue = """
                Main: /main
                Safety: /safety
                Claims: /Claims
                Personal: /personal
                Company: /company
                """;

        assertThat(mainMenu.toString()).isEqualTo(returnValue);
    }

    @Test
    void shoulThrowsAnErrorIfAddElementOnLeaf() {
        Assertions.assertThrows(
                UnsupportedOperationException.class,
                () -> {
                    MenuItem home = new MenuItem("Home", "/home");
                    MenuItem personalClaims = new MenuItem("About", "/about");
                    home.add(personalClaims);
                });
    }
}
