package com.github.rinaudosal.designpatterns.behavioral.state;

/**
 * Concrete State class to manage {@link FanLowState}
 */
public class FanLowState implements State {

    private final Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        fan.setMessage("Fan is Low");
    }
}
