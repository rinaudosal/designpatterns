package com.github.rinaudosal.designpatterns.behavioral.memento;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 2019/07/19
 *
 * @author Sirius
 */
public class MementoEverydayTest {

    @Test
    public void shouldSerializeAndDeserialize() {
        Employee emp = new Employee();
        emp.setName("Bryan Hansen");
        emp.setAddress("111 E Code Street");
        emp.setPhone("888-555-1212");

        MementoEveryday.serialize(emp);

        Employee newEmp = MementoEveryday.deserialize();

        Assertions.assertThat(newEmp.getAddress()).isEqualTo("111 E Code Street");
        Assertions.assertThat(newEmp.getName()).isEqualTo("Bryan Hansen");
        Assertions.assertThat(newEmp.getPhone()).isEqualTo("888-555-1212");

    }


}
