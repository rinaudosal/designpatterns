package com.github.rinaudosal.designpatterns.behavioral.state;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StateTest {

	private static Fan target;

	@BeforeEach
	public void setUp() {
		target = new Fan();
	}

	@Test
	public void workflowStateConfigured() {
		Assertions.assertThat(target.getState())
			.isExactlyInstanceOf(FanOffState.class);

		target.pullChain();
		Assertions.assertThat(target.getState())
			.isExactlyInstanceOf(FanLowState.class);

		target.pullChain();
		Assertions.assertThat(target.getState())
			.isExactlyInstanceOf(FanMedState.class);

		target.pullChain();
		Assertions.assertThat(target.getState())
			.isExactlyInstanceOf(FanHighState.class);

		target.pullChain();
		Assertions.assertThat(target.getState())
			.isExactlyInstanceOf(FanOffState.class);
	}
}
