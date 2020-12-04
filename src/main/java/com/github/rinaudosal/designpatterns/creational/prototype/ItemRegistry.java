package com.github.rinaudosal.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;


public class ItemRegistry {
    private final Map<ItemEnum, Item> itemList = new HashMap<>();

    public ItemRegistry() {
        itemList.put(ItemEnum.BOOK, new BookItem().pages(300).price(23.00).title("Lord of the rings").url("www.amazon.it/books"));
        itemList.put(ItemEnum.MOVIE, new MovieItem().hours(4).price(23.00).title("Star wars. Episode 1").url("www.amazon.it/movies"));
    }

    public <T extends Item> T getItem(ItemEnum item) throws CloneNotSupportedException {
        return (T) itemList.get(item).clone();
    }
}
