package com.github.rinaudosal.designpatterns.creational.singleton;

import java.util.UUID;

/**
 * Singleton Pattern example
 * This class have the following features:
 * - Thread-Safe
 * - Singleton
 * - LazyLoading
 */
public class Home {
    private static volatile Home home = null;
    private final UUID homeName;

    private Home() {
        if (home != null) {
            throw new RuntimeException("You cannot access by reflection, use getInstance() Method");
        }

        homeName = UUID.randomUUID();
    }

    public UUID getHomeName() {
        return homeName;
    }

    public static Home getInstance() {
        if (home == null) {
            synchronized (Home.class) {
                home = new Home();
            }
        }
        return home;
    }
}
