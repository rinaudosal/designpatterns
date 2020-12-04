package com.github.rinaudosal.designpatterns.creational.abstractfactory;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
public abstract class CreditCard {
    private String number;
    private String cvv;
    private CardType type;
}
