package com.github.rinaudosal.designpatterns.behavioral.command;

import java.util.List;

/**
 * {@link ToggleAllLightsCommand} implementation to turn off all Lights
 */
public class ToggleAllLightsCommand implements LightCommand {

    private final List<Light> lights;

    /**
     * Required data are filled in constructor
     *
     * @param lights the lights to be toggled
     */
    public ToggleAllLightsCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.forEach(Light::toggle);
    }

}
