package com.github.rinaudosal.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ItemCatalog {
    private final Map<String, Item> items = new HashMap<>();

    public Item lookup(String itemName) {
        return items.computeIfAbsent(itemName, Item::new);
    }

    public Integer countItems() {
        return items.size();
    }
}
