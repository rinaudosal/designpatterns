package com.github.rinaudosal.designpatterns.behavioral.memento;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeRepositoryTest {

    @Test
    public void iCanSaveAnEmployee() {

        // create a caretaker
        EmployeeRepository employeeRepository = new EmployeeRepository();

        // create a originator
        Employee employee = new Employee();
        String idGenerated = employee.getId();

        employee.setName("John Wick");
        employee.setAddress("111 Main Street");
        employee.setPhone("888-555-1212");

        // save a originator
        employeeRepository.save(employee);

        assertThat(employee.getId()).isNotEmpty();
        assertThat(employee.getId()).isEqualTo(idGenerated);
        assertThat(employee.getAddress()).isEqualTo("111 Main Street");
        assertThat(employee.getName()).isEqualTo("John Wick");
        assertThat(employee.getPhone()).isEqualTo("888-555-1212");

        // update and save originator
        employee.setPhone("444-555-6666");
        employeeRepository.save(employee);

        // verify updated data
        assertThat(employee.getId()).isEqualTo(idGenerated);
        assertThat(employee.getAddress()).isEqualTo("111 Main Street");
        assertThat(employee.getName()).isEqualTo("John Wick");
        assertThat(employee.getPhone()).isEqualTo("444-555-6666");
    }

    @Test
    void iCanRollbackSavedEmployee() {
        // create a caretaker
        EmployeeRepository employeeRepository = new EmployeeRepository();

        // create a originator
        Employee employee = new Employee();
        String idGenerated = employee.getId();

        employee.setName("John Wick");
        employee.setAddress("111 Main Street");
        employee.setPhone("888-555-1212");
        employeeRepository.save(employee);

        assertThat(employee.getId()).isEqualTo(idGenerated);
        assertThat(employee.getName()).isEqualTo("John Wick");
        assertThat(employee.getAddress()).isEqualTo("111 Main Street");
        assertThat(employee.getPhone()).isEqualTo("888-555-1212");

        employee.setName("PIPPO");
        employeeRepository.save(employee);
        assertThat(employee.getId()).isEqualTo(idGenerated);
        assertThat(employee.getName()).isEqualTo("PIPPO");
        assertThat(employee.getAddress()).isEqualTo("111 Main Street");
        assertThat(employee.getPhone()).isEqualTo("888-555-1212");


        employeeRepository.revert(employee); //undo first save, now i have only one history data
        employeeRepository.revert(employee); //undo second save, now i have empty repository

        assertThat(employee.getId()).isEqualTo(idGenerated);
        assertThat(employee.getAddress()).isEqualTo("111 Main Street");
        assertThat(employee.getName()).isEqualTo("John Wick");
        assertThat(employee.getPhone()).isEqualTo("888-555-1212");

    }
}
