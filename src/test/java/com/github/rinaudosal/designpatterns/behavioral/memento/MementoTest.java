package com.github.rinaudosal.designpatterns.behavioral.memento;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MementoTest {

	@Test
	public void mementoWorks() {

		// create a caretaker
		Caretaker caretaker = new Caretaker();

		// create a originator
		Employee emp = new Employee();
		
		emp.setName("John Wick");
		emp.setAddress("111 Main Street");
		emp.setPhone("888-555-1212");

		// save a originator
		caretaker.save(emp);

		assertThat(emp.getAddress()).isEqualTo("111 Main Street");
		assertThat(emp.getName()).isEqualTo("John Wick");
		assertThat(emp.getPhone()).isEqualTo("888-555-1212");

		// update and save originator
		emp.setPhone("444-555-6666");
		caretaker.save(emp);

		// verify updated data
		assertThat(emp.getAddress()).isEqualTo("111 Main Street");
		assertThat(emp.getName()).isEqualTo("John Wick");
		assertThat(emp.getPhone()).isEqualTo("444-555-6666");

		caretaker.revert(emp);

		assertThat(emp.getAddress()).isEqualTo("111 Main Street");
		assertThat(emp.getName()).isEqualTo("John Wick");
		assertThat(emp.getPhone()).isEqualTo("444-555-6666");

		// revert to last point
		caretaker.revert(emp);

		assertThat(emp.getAddress()).isEqualTo("111 Main Street");
		assertThat(emp.getName()).isEqualTo("John Wick");
		assertThat(emp.getPhone()).isEqualTo("888-555-1212");

	}
}
