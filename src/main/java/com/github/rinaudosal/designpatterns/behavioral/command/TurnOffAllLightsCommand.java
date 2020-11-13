package com.github.rinaudosal.designpatterns.behavioral.command;

import java.util.List;

/**
 * {@link TurnOffAllLightsCommand} implementation to turn off all Lights
 */
public class TurnOffAllLightsCommand implements Command {

    private List<Light> lights;

    /**
     * Required data are filled in constructor
     *
     * @param lights the lights to be turn off
     */
    public TurnOffAllLightsCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.forEach(Light::off);
    }

}
