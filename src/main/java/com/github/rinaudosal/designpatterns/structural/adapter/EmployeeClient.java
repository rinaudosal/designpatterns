package com.github.rinaudosal.designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        //Non-Legacy code, i have the possibility to create a db object that implements Employee interface
        EmployeeDB employeeDB = new EmployeeDB("123", "pippo", "disney", "pippo@disney.com");
        employees.add(employeeDB);

        //Legacy LDAP code, i cannot change-it, it's necessary create an adapter
        EmployeeLDAP employeeLDAP = new EmployeeLDAP("pluto@cn=disney", "pluto", "disney", "pluto@disney.com");
        employees.add(new EmployeeLDAPAdapter(employeeLDAP));

        //Legacy CSV code, in this case i have to be manipulate the data to have the same return type
        EmployeeCSV employeeCSV = new EmployeeCSV("1,buzz,Light year,buzzlightyear@pixar.com");
        employees.add(new EmployeeCSVAdapter(employeeCSV));

        return employees;
    }
}
