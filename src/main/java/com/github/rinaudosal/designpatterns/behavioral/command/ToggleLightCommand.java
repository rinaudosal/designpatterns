package com.github.rinaudosal.designpatterns.behavioral.command;


/**
 * {@link ToggleLightCommand} toggler for the light
 */
public class ToggleLightCommand implements LightCommand {

    private Light light;

    public ToggleLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }
}
