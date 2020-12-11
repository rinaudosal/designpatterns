package com.github.rinaudosal.designpatterns.structural.flyweight;

public class Order {
    private final Item item;
    private final Integer number;

    public Order(Item item, Integer number) {
        this.item = item;
        this.number = number;
    }

    public String process() {
        return String.format("Order number %s processed with item %s", number, item);
    }
}
