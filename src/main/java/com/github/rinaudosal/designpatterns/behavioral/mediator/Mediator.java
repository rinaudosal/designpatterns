package com.github.rinaudosal.designpatterns.behavioral.mediator;

import com.github.rinaudosal.designpatterns.behavioral.command.Light;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    private final List<Light> lights = new ArrayList<>();

    public void registerLight(Light light) {
        lights.add(light);
    }

    public void turnOnAllLights() {
        lights.forEach(Light::on);
    }

    public void turnOffAllLights() {
        lights.forEach(Light::off);
    }
}
