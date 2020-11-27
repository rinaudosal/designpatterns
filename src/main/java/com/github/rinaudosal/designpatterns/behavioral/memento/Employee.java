package com.github.rinaudosal.designpatterns.behavioral.memento;

import lombok.Getter;

import java.io.Serializable;
import java.util.UUID;

/**
 * In Memento pattern this is the Originator Actor
 */
@Getter
public class Employee implements Serializable {

    private final String id;
    private String name;
    private String address;
    private String phone;

    public Employee() {
        this.id = UUID.randomUUID().toString();
    }

    public Employee(String id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Save actual istance of object to be reverted
     *
     * @return Data stored
     */
    public Employee save() {
        return new Employee(id, name, address, phone);
    }

    /**
     * Revert actual data with last saved element
     *
     * @param employeeMemento last record saved
     */
    public void revert(Employee employeeMemento) {
        this.name = employeeMemento.getName();
        this.phone = employeeMemento.getPhone();
        this.address = employeeMemento.getAddress();
    }
}
