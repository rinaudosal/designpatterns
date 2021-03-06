package com.github.rinaudosal.designpatterns.behavioral.mediator;

import com.github.rinaudosal.designpatterns.behavioral.command.LightCommand;

/**
 * ConcreteCommand with mediator to manage Lights
 */
public class TurnOffAllLightsWithMediatorLightCommand implements LightCommand {

    private final Mediator mediator;

    public TurnOffAllLightsWithMediatorLightCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOffAllLights();
    }
}
