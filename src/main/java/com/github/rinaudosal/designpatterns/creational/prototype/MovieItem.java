package com.github.rinaudosal.designpatterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
public class MovieItem extends Item {
    private int hours;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
