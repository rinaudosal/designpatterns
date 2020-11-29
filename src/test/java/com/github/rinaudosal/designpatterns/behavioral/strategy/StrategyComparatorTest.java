package com.github.rinaudosal.designpatterns.behavioral.strategy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyComparatorTest {

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
    public void collectionNotSorted() {
        Assertions.assertThat(people).containsExactly(bryan, mark, chris);
    }

    @Test
    public void collectionSortedByPhoneNumberWithComparator() {
        people.sort(Comparator.comparing(Person::getPhoneNumber));
        Assertions.assertThat(people).containsExactly(chris, mark, bryan);
    }

    @Test
    public void collectionSortedByAgeWithLambda() {
        people.sort(Comparator.comparingInt(Person::getAge));
        Assertions.assertThat(people).containsExactly(chris, bryan, mark);
    }

    @Test
    public void collectionSortedByName() {
        people.sort(Comparator.comparing(Person::getName));
        Assertions.assertThat(people).containsExactly(bryan, chris, mark);
    }
}
