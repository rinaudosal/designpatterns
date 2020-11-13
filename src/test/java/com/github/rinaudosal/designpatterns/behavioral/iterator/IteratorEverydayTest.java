package com.github.rinaudosal.designpatterns.behavioral.iterator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorEverydayTest {

    private static Set<String> names;

    @BeforeEach
    public void setUp() {
        names = new HashSet<>();
        names.add("Bryan");
        names.add("Aaron");
        names.add("Jason");
    }

    @Test
    public void checkSetAreConsumed() {
        Iterator<String> namesItr = names.iterator();

        // consume full Set
        while (namesItr.hasNext()) {
            String name = namesItr.next();
            System.out.println(name);
            namesItr.remove();
        }

        Assertions.assertThat(names.size()).isZero();
    }

    @Test
    public void checkIteratorAreThreadSafe() {
        Iterator<String> namesItr = names.iterator();
        Iterator<String> namesItr2 = names.iterator();

        // consumes first element of second iterator
        namesItr2.next();

        // consume all elements of first iterator
        while (namesItr.hasNext()) {
            String name = namesItr.next();
            System.out.println(name);
            namesItr.remove();
        }

        // result is zero because iterators are different
        Assertions.assertThat(names.size()).isZero();
    }
}
