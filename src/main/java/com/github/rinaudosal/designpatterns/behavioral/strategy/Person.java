package com.github.rinaudosal.designpatterns.behavioral.strategy;

/**
 * Domain class for StrategyComparatorTest class
 */
public class Person {

    private final int age;
    private final String name;
    private final String phoneNumber;

    public Person(String name, String phoneNumber, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
