package com.github.rinaudosal.designpatterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.awt.print.Book;

@Getter
@Setter
@Accessors(fluent = true)
public class BookItem extends Item {
    private int pages;

}
