package com.github.rinaudosal.designpatterns.creational.abstractfactory;

public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int score) {
        if (score>650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType platinum);
}
