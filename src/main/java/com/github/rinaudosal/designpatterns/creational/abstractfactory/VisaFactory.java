package com.github.rinaudosal.designpatterns.creational.abstractfactory;

import java.util.UUID;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType type) {
        return new VisaCard()
                .type(type)
                .number("45" + UUID.randomUUID().toString())
                .cvv("444");
    }
}
