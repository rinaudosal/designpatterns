package ch.codeway.sirius.designpattern.behavioral.memento;

/**
 * Memento is a CopyObject to contain only data to save
 */
public class EmployeeMemento {

    private String name;
    private String phone;

    public EmployeeMemento(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
