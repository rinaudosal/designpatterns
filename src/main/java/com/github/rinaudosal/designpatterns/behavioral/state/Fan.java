package com.github.rinaudosal.designpatterns.behavioral.state;

import java.util.HashMap;
import java.util.Map;

/**
 * Simple Object with state Variable and States allowed
 */
public class Fan {

    /**
     * Map containing all states allowed for Fan class
     */
    private final Map<StateEnum, State> acceptableStates;

    /**
     * The actual state
     */
    private State state;

    private String message;

    public Fan() {
        acceptableStates = new HashMap<>();
        acceptableStates.put(StateEnum.OFF, new FanOffState(this));
        acceptableStates.put(StateEnum.LOW, new FanLowState(this));
        acceptableStates.put(StateEnum.HIGH, new FanHighState(this));

        // we set fan state to OFF by default
        state = acceptableStates.get(StateEnum.OFF);
    }

    public void pullChain(StateEnum stateEnum) {
        state = acceptableStates.get(stateEnum);
        state.handleRequest();
    }

    public State getState() {
        return state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}


