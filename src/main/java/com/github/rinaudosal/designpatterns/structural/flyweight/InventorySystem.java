package com.github.rinaudosal.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {
    private final ItemCatalog catalog = new ItemCatalog();
    private final List<Order> orders = new CopyOnWriteArrayList<>();

    public void takeOrder(String orderName, Integer orderNumber) {
        Item item = catalog.lookup(orderName);
        Order order = new Order(item, orderNumber);
        orders.add(order);
    }

    public List<String> processOrders() {
        final List<String> results = new ArrayList<>();
        orders.forEach(order -> {
            results.add(order.process());
            orders.remove(order);
        });

        return results;
    }


    public Integer countItemsCreated() {
        return catalog.countItems();
    }

}
