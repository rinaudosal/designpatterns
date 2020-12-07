package com.github.rinaudosal.designpatterns.structural.adapter;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AdapterTest {

    @Test
    void testEmployeeFromDifferentSource() {
        List<Employee> employees = EmployeeClient.getEmployees();

        assertThat(employees).hasSize(3);
        checkEmployee(employees.get(0), "123", "pippo", "disney", "pippo@disney.com"); //Pippo from DB
        checkEmployee(employees.get(1), "pluto@cn=disney", "pluto", "disney", "pluto@disney.com"); //Pluto from LDAP
        checkEmployee(employees.get(2), "1", "buzz", "Light year", "buzzlightyear@pixar.com"); //Buzz from CSV
    }

    private void checkEmployee(Employee employee, String id, String name, String surname, String email) {
        assertThat(employee.getId()).isEqualTo(id);
        assertThat(employee.getName()).isEqualTo(name);
        assertThat(employee.getSurname()).isEqualTo(surname);
        assertThat(employee.getEmail()).isEqualTo(email);
    }
}
