package com.github.rinaudosal.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {
    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public MenuComponent add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
        return menuComponent;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(); //builder pattern

        builder.append(print(this));

        for (MenuComponent menuComponent : menuComponents) {
            builder.append(menuComponent.toString());
        }

        return builder.toString();
    }
}
