package com.github.rinaudosal.designpatterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
public abstract class Item implements Cloneable {
    private String title;
    private Double price;
    private String url;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
