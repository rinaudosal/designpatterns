package com.github.rinaudosal.designpatterns.behavioral.command;

import java.util.List;

/**
 * {@link TurnOffAllLightsLightCommand} implementation to turn off all Lights
 */
public class TurnOffAllLightsLightCommand implements LightCommand {

    private final List<Light> lights;

    /**
     * Required data are filled in constructor
     *
     * @param lights the lights to be turn off
     */
    public TurnOffAllLightsLightCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.forEach(Light::off);
    }

}
