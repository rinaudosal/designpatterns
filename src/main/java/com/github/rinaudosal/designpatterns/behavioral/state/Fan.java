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
    Map<StateEnum, State> states;

    /**
     * The actual state
     */
    private State state;

    public Fan() {
        states = new HashMap<>();
        states.put(StateEnum.OFF, new FanOffState(this));
        states.put(StateEnum.LOW, new FanLowState(this));
        states.put(StateEnum.MEDIUM, new FanMedState(this));
        states.put(StateEnum.HIGH, new FanHighState(this));

        state = states.get(StateEnum.OFF);
    }

    public void pullChain() {
        state.handleRequest();
    }

    public String toString() {
        return state.toString();
    }

    public State getState() {
        return state;
    }

    public State getFanState(StateEnum stateEnum) {
        return states.get(stateEnum);
    }

    public void setState(State state) {
        this.state = state;
    }
}


