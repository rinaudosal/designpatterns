package com.github.rinaudosal.designpatterns.behavioral.mediator;

import com.github.rinaudosal.designpatterns.behavioral.command.LightCommand;

/**
 * ConcreteCommand with mediator to manage Lights
 */
public class TurnOnAllLightsWithMediatorLightCommand implements LightCommand {

    private Mediator med;

    public TurnOnAllLightsWithMediatorLightCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOnAllLights();
    }
}
