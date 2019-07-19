package ch.codeway.sirius.designpattern.behavioral.mediator;

import ch.codeway.sirius.designpattern.behavioral.command.Command;
import ch.codeway.sirius.designpattern.behavioral.command.Light;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MediatorTest {

	@Test
	public void mediatorTurnOffOnAllLights() {
		// Receiver
		Light bedroomLight = new Light();
		Light kitchenLight = new Light();

		// Mediatore
		Mediator mediator = new Mediator();
		mediator.registerLight(bedroomLight);
		mediator.registerLight(kitchenLight);

		// ConcreteCommands executed
		Command turnOnAllLightsCommand = new TurnOnAllLightsWithMediatorCommand(mediator);
		turnOnAllLightsCommand.execute();
		Assertions.assertThat(bedroomLight.isOn()).isTrue();
		Assertions.assertThat(kitchenLight.isOn()).isTrue();

		Command turnOffAllLightsCommand = new TurnOffAllLightsWithMediatorCommand(mediator);
		turnOffAllLightsCommand.execute();
		Assertions.assertThat(bedroomLight.isOn()).isFalse();
		Assertions.assertThat(kitchenLight.isOn()).isFalse();
	}

}
