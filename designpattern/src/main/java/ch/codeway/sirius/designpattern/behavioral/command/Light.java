package ch.codeway.sirius.designpattern.behavioral.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Receiver actor in Command Pattern
 */
public class Light {
    private static final Logger logger = LoggerFactory.getLogger(Light.class);

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
        logger.info("Light switched on.");
    }

    /**
     * Method to switch off the light, if already off nothing to do
     */
    public void off() {
        this.isOn = false;
        logger.info("Light switched off.");
    }
}
