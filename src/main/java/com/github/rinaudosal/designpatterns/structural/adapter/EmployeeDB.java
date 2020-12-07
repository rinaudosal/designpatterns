package com.github.rinaudosal.designpatterns.structural.adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmployeeDB implements Employee {
    private final String id;
    private final String name;
    private final String surname;
    private final String email;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getEmail() {
        return email;
    }

}
