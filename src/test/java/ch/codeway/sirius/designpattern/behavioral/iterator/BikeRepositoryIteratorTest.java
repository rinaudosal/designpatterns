package ch.codeway.sirius.designpattern.behavioral.iterator;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

public class BikeRepositoryIteratorTest {

    private static BikeRepository bikeRepository;

    @Before
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
        Assertions.assertThat(bikeIterator.next()).isEqualTo("Cervelo");
        Assertions.assertThat(bikeIterator.next()).isEqualTo("Scott");
        Assertions.assertThat(bikeIterator.next()).isEqualTo("Fuji");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void removeOperationAreUnsupported() {
        bikeRepository.iterator().remove();
    }
}
