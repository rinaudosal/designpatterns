package com.github.rinaudosal.designpatterns.creational.singleton;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class HomeTest {

    @Test
    void accessToSingletonReturnsSameInstance() {
        Home home1 = Home.getInstance();
        Home home2 = Home.getInstance();

        assertThat(home1).isEqualTo(home2);
        assertThat(home1.getHomeName()).isEqualTo(home2.getHomeName());
    }

    @Test
    void itThrowsRuntimeExceptionIfIAccessToPrivateConstructor() {
        Home.getInstance();
        assertThatThrownBy(() -> {
            Constructor<Home> declaredConstructor = Home.class.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            declaredConstructor.newInstance();
        }).isInstanceOf(InvocationTargetException.class)
                .hasRootCauseExactlyInstanceOf(RuntimeException.class);
    }

}