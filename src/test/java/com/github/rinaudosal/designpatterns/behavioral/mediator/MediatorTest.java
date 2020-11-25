package com.github.rinaudosal.designpatterns.behavioral.mediator;

import com.github.rinaudosal.designpatterns.behavioral.command.LightCommand;
import com.github.rinaudosal.designpatterns.behavioral.command.Light;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MediatorTest {

	@Test
	void commandTurnOnOffAllLightsByMediator() {
		// The Receiver is a single element (Passive)
		Light bedroomLight = new Light();
		Light kitchenLight = new Light();

		// Mediator is the orchestrator that manage the Receiver (One or many)
		Mediator mediator = new Mediator();
		mediator.registerLight(bedroomLight);
		mediator.registerLight(kitchenLight);

		// ConcreteCommands execute the action by mediator
		LightCommand turnOnAllLightsCommand = new TurnOnAllLightsWithMediatorLightCommand(mediator);
		Assertions.assertThat(bedroomLight.isOn()).isFalse();
		Assertions.assertThat(kitchenLight.isOn()).isFalse();
		turnOnAllLightsCommand.execute();
		Assertions.assertThat(bedroomLight.isOn()).isTrue();
		Assertions.assertThat(kitchenLight.isOn()).isTrue();

		LightCommand turnOffAllLightsCommand = new TurnOffAllLightsWithMediatorLightCommand(mediator);
		turnOffAllLightsCommand.execute();
		Assertions.assertThat(bedroomLight.isOn()).isFalse();
		Assertions.assertThat(kitchenLight.isOn()).isFalse();
	}

}
