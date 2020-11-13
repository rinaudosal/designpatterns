package com.github.rinaudosal.designpatterns.behavioral.observer;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * This is a Observable actor in Observe pattern
 */
public class MessageStream extends Subject {

    private Deque<String> messageHistory = new ArrayDeque<>();

    /**
     * save data and notify all observer registered
     *
     * @param message message to add
     */
    @Override
    void setState(String message) {
        messageHistory.add(message);
        this.notifyObservers();
    }

    @Override
    String getState() {
        return messageHistory.getLast();
    }
}
