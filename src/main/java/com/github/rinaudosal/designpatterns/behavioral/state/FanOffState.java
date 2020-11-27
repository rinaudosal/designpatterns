package com.github.rinaudosal.designpatterns.behavioral.state;

public class FanOffState implements State {
    private final Fan fan;

    public FanOffState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        fan.setMessage("Fan is Off");
    }
}
