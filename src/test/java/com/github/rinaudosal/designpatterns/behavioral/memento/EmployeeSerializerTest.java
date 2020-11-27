package com.github.rinaudosal.designpatterns.behavioral.memento;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * 2019/07/19
 *
 * @author Sirius
 */
public class EmployeeSerializerTest {

    @Test
    public void iCanSerializeAndDeserializeAnObject() throws Exception{
        Employee emp = new Employee();
        emp.setName("Bryan Hansen");
        emp.setAddress("111 E Code Street");
        emp.setPhone("888-555-1212");

        EmployeeSerializer.serialize(emp, String.format("/tmp/employee%s.ser", emp.getId()));

        Employee newEmp = EmployeeSerializer.deserialize(String.format("/tmp/employee%s.ser", emp.getId()));

        Assertions.assertThat(newEmp.getAddress()).isEqualTo("111 E Code Street");
        Assertions.assertThat(newEmp.getName()).isEqualTo("Bryan Hansen");
        Assertions.assertThat(newEmp.getPhone()).isEqualTo("888-555-1212");
    }

    @Test
    void iCannotDeserializeEmptyFile() {
        assertThrows(IOException.class, () -> EmployeeSerializer.deserialize("pfffcd"));

        //Delete file if created
        Assertions.assertThat(new File("pfffcd").delete()).isFalse();
    }

}
