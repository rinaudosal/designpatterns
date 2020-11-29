package com.github.rinaudosal.designpatterns.behavioral.strategy;

import lombok.Getter;
import lombok.Setter;

/**
 * Domain class that have {@link ValidationStrategy} example for validity of credit card
 */
public class CreditCard {

    @Getter
    @Setter
    private String number;
    @Getter
    @Setter
    private String date;
    @Getter
    @Setter
    private String cvv;

    /**
     * Strategy managed from the client, domain class don't know which strategy are applied
     */
    private final ValidationStrategy strategy;


    /**
     * in the constructor, the Validation class is required, because otherwire maybe you will have {@link NullPointerException}
     *
     * @param strategy the concrete strategy
     */
    public CreditCard(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Boolean method that use strategy to check validity
     *
     * @return true if valid, false otherwise
     */
    public boolean isValid() {
        return strategy.isValid(this);
    }

}
