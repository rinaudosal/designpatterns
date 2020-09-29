package ch.codeway.sirius.designpattern.behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FanOffState extends State {
    private static final Logger log = LoggerFactory.getLogger(FanLowState.class);

    private Fan fan;

    public FanOffState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        log.info("Turning fan on to low.");
        fan.setState(fan.getFanState(StateEnum.LOW));
    }

    public String toString() {
        return "Fan is off.";
    }
}
