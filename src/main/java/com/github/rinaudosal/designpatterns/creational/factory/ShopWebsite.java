package com.github.rinaudosal.designpatterns.creational.factory;

import java.util.Arrays;

public class ShopWebsite extends Website {
    @Override
    protected void createWebsite() {
        this.setSiteName("Shop");
        this.setPages(Arrays.asList("cart", "search", "contact"));
    }
}
