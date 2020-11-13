package com.github.rinaudosal.designpatterns.behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FanMedState extends State {
    private static final Logger log = LoggerFactory.getLogger(FanLowState.class);

    private Fan fan;

    public FanMedState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        log.info("Turning fan on to high...");
        fan.setState(fan.getFanState(StateEnum.HIGH));
    }

    public String toString() {
        return "Fan is on med.";
    }
}
