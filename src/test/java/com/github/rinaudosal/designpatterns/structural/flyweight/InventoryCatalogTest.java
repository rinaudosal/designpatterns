package com.github.rinaudosal.designpatterns.structural.flyweight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class InventoryCatalogTest {
    private InventorySystem target;

    @BeforeEach
    void setUp() {
        target = new InventorySystem();

        // creates 3 elements for 5 orders
        target.takeOrder("Samsung TV", 1);
        target.takeOrder("Samsung TV", 2);
        target.takeOrder("Samsung TV", 3);
        target.takeOrder("Apple TV", 4);
        target.takeOrder("Android TV", 5);
    }

    @Test
    void flyweightCatalogShouldWorks() {
        assertThat(target.countItemsCreated()).isEqualTo(3);
    }

    @Test
    void takeAndProcessOrdersShouldWorks() {
        List<String> ordersProcessed = target.processOrders();

        assertThat(ordersProcessed).containsExactly(
                "Order number 1 processed with item Samsung TV",
                "Order number 2 processed with item Samsung TV",
                "Order number 3 processed with item Samsung TV",
                "Order number 4 processed with item Apple TV",
                "Order number 5 processed with item Android TV");
    }

}