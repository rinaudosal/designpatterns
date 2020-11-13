package com.github.rinaudosal.designpatterns.behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Concrete State class to manage {@link FanHighState}
 */
public class FanHighState extends State {
    private static final Logger log = LoggerFactory.getLogger(FanHighState.class);

    private Fan fan;

    public FanHighState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        log.info("Turning fan off...");
        fan.setState(fan.getFanState(StateEnum.OFF));
    }

    public String toString() {
        return "Fan is on high.";
    }
}
