package com.github.rinaudosal.designpatterns.behavioral.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Receiver
 */
public class Light {
    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if (this.isOn) {
            this.off();
        } else {
            this.on();
        }
    }

    /**
     * Method to switch on the light, if already on nothing to do
     */
    public void on() {
        this.isOn = true;
    }

    /**
     * Method to switch off the light, if already off nothing to do
     */
    public void off() {
        this.isOn = false;
    }
}
