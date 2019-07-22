package ch.codeway.sirius.designpattern.behavioral.mediator;

import ch.codeway.sirius.designpattern.behavioral.command.Light;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    private List<Light> lights = new ArrayList<>();

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