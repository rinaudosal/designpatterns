package com.github.rinaudosal.designpatterns.behavioral.mediator;

import com.github.rinaudosal.designpatterns.behavioral.command.LightCommand;

/**
 * ConcreteCommand with mediator to manage Lights
 */
public class TurnOffAllLightsWithMediatorLightCommand implements LightCommand {

    private Mediator med;

    public TurnOffAllLightsWithMediatorLightCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOffAllLights();
    }
}
