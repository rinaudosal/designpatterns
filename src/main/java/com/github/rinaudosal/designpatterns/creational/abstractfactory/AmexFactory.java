package com.github.rinaudosal.designpatterns.creational.abstractfactory;

import java.util.UUID;

public class AmexFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType type) {
        return new AmexCard()
                .type(type)
                .number("54" + UUID.randomUUID().toString())
                .cvv("444");
    }
}
