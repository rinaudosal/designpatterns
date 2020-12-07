package com.github.rinaudosal.designpatterns.structural.adapter;

public class EmployeeCSVAdapter implements Employee {
    private EmployeeCSV employeeCSV;
    public EmployeeCSVAdapter(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
    }


    @Override
    public String getId() {
        return "" + this.employeeCSV.getId();
    }

    @Override
    public String getName() {
        return this.employeeCSV.getName();
    }

    @Override
    public String getSurname() {
        return this.employeeCSV.getSurname();
    }

    @Override
    public String getEmail() {
        return this.employeeCSV.getEmail();
    }
}
