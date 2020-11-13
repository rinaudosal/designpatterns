package com.github.rinaudosal.designpatterns.behavioral.command;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Test example in Command Pattern Example
 */
public class LightCommandTest {

    private Light bedroomLight;
    private Light kitchenLight;
    private LightInvoker lightLightInvoker;

    @BeforeEach
    public void setUp() {
        bedroomLight = new Light();
        kitchenLight = new Light();

        lightLightInvoker = new LightInvoker();
    }

    @Test
    public void turnOffAllLights() {
        // Receivers
        bedroomLight.off();
        kitchenLight.on();

        // Command
        LightCommand turnOffCommand = new TurnOffAllLightsLightCommand(Arrays.asList(bedroomLight, kitchenLight));

        // Invoker
        lightLightInvoker.storeAndExecute(turnOffCommand);

        // Assertion
        Assertions.assertThat(bedroomLight.isOn()).isFalse();
        Assertions.assertThat(kitchenLight.isOn()).isFalse();
    }

    @Test
    public void toggleAllLights() {
        // Receivers
        bedroomLight.off();
        kitchenLight.on();

        // Command
        LightCommand toggleAllLightsCommand = new ToggleAllLightsCommand(Arrays.asList(bedroomLight, kitchenLight));

        // Invoker
        lightLightInvoker.storeAndExecute(toggleAllLightsCommand);

        // Assertion
        Assertions.assertThat(bedroomLight.isOn()).isTrue();
        Assertions.assertThat(kitchenLight.isOn()).isFalse();
    }

    @Test
    public void toggleSingleLight() {
        // Receivers
        kitchenLight.on();

        // Command
        LightCommand toggleCommand = new ToggleLightCommand(kitchenLight);

        // Invoker
        lightLightInvoker.storeAndExecute(toggleCommand);

        // Assertion
        Assertions.assertThat(kitchenLight.isOn()).isFalse();
    }

}
