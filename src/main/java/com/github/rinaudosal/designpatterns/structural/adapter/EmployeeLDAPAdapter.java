package com.github.rinaudosal.designpatterns.structural.adapter;

public class EmployeeLDAPAdapter implements Employee {
    private final EmployeeLDAP employeeLDAP;

    public EmployeeLDAPAdapter(EmployeeLDAP employeeLDAP) {
        this.employeeLDAP = employeeLDAP;
    }

    @Override
    public String getId() {
        return this.employeeLDAP.getCn();
    }

    @Override
    public String getName() {
        return this.employeeLDAP.getFirstName();
    }

    @Override
    public String getSurname() {
        return this.employeeLDAP.getLastName();
    }

    @Override
    public String getEmail() {
        return this.employeeLDAP.getMail();
    }
}
