package com.github.rinaudosal.designpatterns.behavioral.iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BikeRepositoryIteratorTest {

    private static BikeRepository bikeRepository;

    @BeforeEach
    public void setUp() throws Exception {
        bikeRepository = new BikeRepository();
        bikeRepository.addBike("Cervelo");
        bikeRepository.addBike("Scott");
        bikeRepository.addBike("Fuji");
    }

    @Test
    public void bykeRepositoryAreImplementedCorrectly() {

        // if my object implement iterator interface i can use foreach method!
        bikeRepository.forEach(bike -> System.out.println(bike));

        for (String bike : bikeRepository) {
            System.out.println(bike);
        }

        Iterator<String> bikeIterator = bikeRepository.iterator();
        assertThat(bikeIterator.next()).isEqualTo("Cervelo");
        assertThat(bikeIterator.next()).isEqualTo("Scott");
        assertThat(bikeIterator.next()).isEqualTo("Fuji");
    }

    @Test
    public void removeOperationAreUnsupported() {
        assertThrows(UnsupportedOperationException.class, () -> {
            bikeRepository.iterator().remove();
        });
    }
}
