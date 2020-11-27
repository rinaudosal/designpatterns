package com.github.rinaudosal.designpatterns.behavioral.state;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FanStateTest {

    @Test
    public void workflowStateConfigured() {
        Fan target = new Fan();

        assertThat(target.getState())
                .isExactlyInstanceOf(FanOffState.class);
        assertThat(target.getMessage())
                .isNull();

        target.pullChain(StateEnum.OFF);
        assertThat(target.getState())
                .isExactlyInstanceOf(FanOffState.class);
        assertThat(target.getMessage())
                .isEqualTo("Fan is Off");

        target.pullChain(StateEnum.HIGH);
        assertThat(target.getState())
                .isExactlyInstanceOf(FanHighState.class);
        assertThat(target.getMessage())
                .isEqualTo("Fan is High");

        target.pullChain(StateEnum.LOW);
        assertThat(target.getState())
                .isExactlyInstanceOf(FanLowState.class);
        assertThat(target.getMessage())
                .isEqualTo("Fan is Low");
    }
}
