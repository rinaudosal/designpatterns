package com.github.rinaudosal.designpatterns.behavioral.mediator;

import com.github.rinaudosal.designpatterns.behavioral.command.Command;

/**
 * ConcreteCommand with mediator to manage Lights
 */
public class TurnOffAllLightsWithMediatorCommand implements Command {

    private Mediator med;

    public TurnOffAllLightsWithMediatorCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOffAllLights();
    }
}
