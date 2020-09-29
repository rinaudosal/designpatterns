package ch.codeway.sirius.designpattern.behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Concrete State class to manage {@link FanLowState}
 */
public class FanLowState extends State {
    private static final Logger log = LoggerFactory.getLogger(FanLowState.class);

    private Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        log.info("Turning fan on to med.");
        fan.setState(fan.getFanState(StateEnum.MEDIUM));
    }

    public String toString() {
        return "Fan is low.";
    }
}
