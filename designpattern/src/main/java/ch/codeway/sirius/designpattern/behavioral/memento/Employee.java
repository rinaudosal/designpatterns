package ch.codeway.sirius.designpattern.behavioral.memento;

import java.io.Serializable;

/**
 * In Memento pattern this is the Originator Actor
 */
public class Employee implements Serializable {

    private String name;
    private String address;
    private String phone;

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
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

    public String toString() {
        return name + " : " + phone;
    }

    /**
     * Save actual istance of object to be reverted
     *
     * @return Data stored
     */
    public EmployeeMemento save() {
        return new EmployeeMemento(name, phone);
    }

    /**
     * Revert actual data with last saved element
     *
     * @param employeeMemento last record saved
     */
    public void revert(EmployeeMemento employeeMemento) {
        this.name = employeeMemento.getName();
        this.phone = employeeMemento.getPhone();
    }
}
