package com.github.rinaudosal.designpatterns.behavioral.memento;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

/**
 * Memento example for serialization and deserialization
 */
@Slf4j
public class EmployeeSerializer {

    public static Employee deserialize(String path) throws Exception {
        FileInputStream fileIn = new FileInputStream(path);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Employee employee = (Employee) in.readObject();
        in.close();
        fileIn.close();

        return employee;
    }

    public static void serialize(Employee employee, String path) throws Exception {
        FileOutputStream fileOut = new FileOutputStream(path);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(employee);
        out.close();
        fileOut.close();
    }

}
