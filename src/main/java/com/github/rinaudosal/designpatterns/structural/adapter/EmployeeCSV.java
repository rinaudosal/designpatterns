package com.github.rinaudosal.designpatterns.structural.adapter;

import java.util.StringTokenizer;

public class EmployeeCSV {
    private int id;
    private String name;
    private String surname;
    private String email;

    public EmployeeCSV(String csvLine) {
        StringTokenizer tokenizer = new StringTokenizer(csvLine, ",");
        this.id = Integer.parseInt(tokenizer.nextToken());
        this.name = tokenizer.nextToken();
        this.surname = tokenizer.nextToken();
        this.email = tokenizer.nextToken();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }
}
