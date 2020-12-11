package com.github.rinaudosal.designpatterns.behavioral.mediator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Timer;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class MediatorSchedulerTest {

    @Mock
    private Timer timerMock;

    @Test
    void mediatorExecuteTimerActionsOnConstructor() {
        MediatorScheduler target = new MediatorScheduler(timerMock, 11);
        BDDMockito.verify(timerMock).schedule(Mockito.any(MediatorScheduler.RemindTask.class), Mockito.eq(110L));
        BDDMockito.verify(timerMock).schedule(Mockito.any(MediatorScheduler.RemindTaskWithoutBeep.class), Mockito.eq(220L));
        assertThat(target.getTaskList()).isEmpty();
    }

    @Test
    void mediatorExecuteActions() throws Exception {
        MediatorScheduler target = new MediatorScheduler(new Timer(), 1);

        //Warning!!!! It's only for test of the design pattern purpose, insert a sleep/wait method in the test it's an anti-pattern!
        Thread.sleep(22);

        assertThat(target.getTaskList()).hasSize(2);
        assertThat(target.getTaskList().get(0)).startsWith("RemindTask at ");
        assertThat(target.getTaskList().get(1)).startsWith("RemindTaskWithoutBeep at");
    }

}