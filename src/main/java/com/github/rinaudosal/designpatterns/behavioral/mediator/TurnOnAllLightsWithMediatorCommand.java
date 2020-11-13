package com.github.rinaudosal.designpatterns.behavioral.mediator;

import com.github.rinaudosal.designpatterns.behavioral.command.Command;

/**
 * ConcreteCommand with mediator to manage Lights
 */
public class TurnOnAllLightsWithMediatorCommand implements Command {

    private Mediator med;

    public TurnOnAllLightsWithMediatorCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOnAllLights();
    }
}
