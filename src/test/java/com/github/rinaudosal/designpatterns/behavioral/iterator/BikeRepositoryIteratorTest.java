package com.github.rinaudosal.designpatterns.behavioral.iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.assertj.core.api.Assertions.assertThat;

class BikeRepositoryIteratorTest {

    private static BikeRepository bikeRepository;

    @BeforeEach
    public void setUp() throws Exception {
        // i can add major than initial size
        bikeRepository = new BikeRepository(1);
        bikeRepository.addBike("Cervelo");
        bikeRepository.addBike("Scott");
        bikeRepository.addBike("Fuji");
    }

    @Test
    void iCanUseForeachMethodOnBikeRepository() {
        final StringBuilder concatenatedBikeNames = new StringBuilder();
        bikeRepository.forEach(concatenatedBikeNames::append);
        assertThat(concatenatedBikeNames.toString()).isEqualTo("CerveloScottFuji");
    }

    @Test
    void iCanUseForMethodOnBikeRepository() {
        final StringBuilder concatenatedBikeNames = new StringBuilder();
        for (String bike : bikeRepository) {
            concatenatedBikeNames.append(bike);
        }

        assertThat(concatenatedBikeNames.toString()).isEqualTo("CerveloScottFuji");
    }

    @Test
    public void bykeRepositoryAreImplementedCorrectly() {
        Iterator<String> bikeIterator = bikeRepository.iterator();
        assertThat(bikeIterator.next()).isEqualTo("Cervelo");
        assertThat(bikeIterator.next()).isEqualTo("Scott");
        assertThat(bikeIterator.next()).isEqualTo("Fuji");
    }

    @Test
    public void removeOperationAreUnsupported() {
        Assertions.assertThrows(UnsupportedOperationException.class, () -> {
            bikeRepository.iterator().remove();
        });
    }
}
