package com.github.rinaudosal.designpatterns.behavioral.state;

/**
 * Concrete State class to manage {@link FanHighState}
 */
public class FanHighState implements State {

    private final Fan fan;

    public FanHighState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        fan.setMessage("Fan is High");
    }
}
