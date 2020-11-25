package com.github.rinaudosal.designpatterns.behavioral.iterator;

import java.util.Iterator;


/**
 * ConcreteIterator of Patter Iterator
 * In this class i builded manually the iterator of bikes like to {@link java.util.List}
 */
public class BikeRepository implements Iterable<String> {

    private String[] bikes;
    private int index;

    /**
     * Costructor that initialize with default data to iterate
     */
    public BikeRepository(int initialSize) {
        bikes = new String[initialSize];
        index = 0;
    }

    /**
     * Metod to add a single bike in bikes
     *
     * @param bike the bike to add
     */
    public void addBike(String bike) {
        if (index == bikes.length) {
            String[] largerBikes = new String[bikes.length + 5];
            System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
            bikes = largerBikes;
            largerBikes = null;
        }

        bikes[index] = bike;
        index++;
    }

    /**
     * Real method that implement iterator pattern.
     * <p>
     * Note: the pattern consumes data of a class, don't copy new data
     *
     * @return the iterator of datas
     */
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {

            private int currentIndex = 0;

            /**
             * Check if present next value
             * @return true if found, false otherwise
             */
            @Override
            public boolean hasNext() {
                return currentIndex < bikes.length && bikes[currentIndex] != null;
            }

            /**
             * Get nex element, method is error-prone by index
             * @return next element
             * @throws IndexOutOfBoundsException
             */
            @Override
            public String next() {
                return bikes[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

        };
    }
}
