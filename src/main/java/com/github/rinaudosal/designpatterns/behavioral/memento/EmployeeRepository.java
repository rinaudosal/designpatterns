package com.github.rinaudosal.designpatterns.behavioral.memento;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Caretaker Actor
 */
public class EmployeeRepository {

    private final Map<String, Stack<Employee>> employeeHistory = new HashMap<>();

    public void save(Employee employee) {
        employeeHistory
                .computeIfAbsent(employee.getId(), el -> new Stack<>())
                .push(employee.save());
    }

    public void revert(Employee employee) {
        employee.revert(employeeHistory.get(employee.getId()).pop());
    }
}
