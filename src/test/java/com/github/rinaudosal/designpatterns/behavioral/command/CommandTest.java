package com.github.rinaudosal.designpatterns.behavioral.command;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Test example in Command Pattern Example
 */
public class CommandTest {

    private Light bedroomLight;
    private Light kitchenLight;
    private Switch lightSwitch;

    @BeforeEach
    public void setUp() {
        bedroomLight = new Light();
        kitchenLight = new Light();

        lightSwitch = new Switch();
    }

    @Test
    public void turnOffAllLights() {
        // Receivers
        bedroomLight.on();
        kitchenLight.on();

        // Command
        Command turnOffCommand = new TurnOffAllLightsCommand(Arrays.asList(bedroomLight, kitchenLight));

        // Invoker
        lightSwitch.storeAndExecute(turnOffCommand);

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
        Command toggleAllLightsCommand = new ToggleAllLightsCommand(Arrays.asList(bedroomLight, kitchenLight));

        // Invoker
        lightSwitch.storeAndExecute(toggleAllLightsCommand);

        // Assertion
        Assertions.assertThat(bedroomLight.isOn()).isTrue();
        Assertions.assertThat(kitchenLight.isOn()).isFalse();
    }

    @Test
    public void toggleSingleLight() {
        // Receivers
        kitchenLight.on();

        // Command
        Command toggleCommand = new ToggleCommand(kitchenLight);

        // Invoker
        lightSwitch.storeAndExecute(toggleCommand);

        // Assertion
        Assertions.assertThat(kitchenLight.isOn()).isFalse();
    }

}
