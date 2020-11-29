package com.github.rinaudosal.designpatterns.behavioral.template;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonComparatorTest {

    private List<Person> people;
    private Person bryan;
    private Person mark;
    private Person chris;

    @BeforeEach
    public void setUp() {
        bryan = new Person("Bryan", "801-555-1212", 39);
        mark = new Person("Mark", "801-444-1234", 41);
        chris = new Person("Chris", "801-222-5151", 38);

        people = new ArrayList<>();
        people.add(bryan);
        people.add(mark);
        people.add(chris);
    }

    @Test
    public void peopleNotSorted() {
        assertThat(people).containsExactly(bryan, mark, chris);
        checkPerson(bryan, 39, "Bryan", "801-555-1212");
    }

    @Test
    public void peolpleSortedWithItsSort() {
        Collections.sort(people);
        assertThat(people).containsExactly(chris, bryan, mark);
    }

    private void checkPerson(Person person, int age, String name, String phoneNumber) {
        assertThat(person.getAge()).isEqualTo(age);
        assertThat(person.getName()).isEqualTo(name);
        assertThat(person.getPhoneNumber()).isEqualTo(phoneNumber);

    }
}
