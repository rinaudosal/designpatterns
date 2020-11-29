package com.github.rinaudosal.designpatterns.behavioral.template;

import lombok.Getter;

import java.util.Comparator;

public class Person implements Comparable<Person> {

    @Getter
    private final int age;
    @Getter
    private final String name;
    @Getter
    private final String phoneNumber;

    public Person(String name, String phoneNumber, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return Comparator.comparingInt(Person::getAge).compare(this, o);
    }

}
