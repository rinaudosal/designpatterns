package com.github.rinaudosal.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MediatorScheduler {

    private final Timer timer;
    private final List<String> taskList = new ArrayList<>();

    public MediatorScheduler(Timer timer, int seconds) {
        this.timer = timer;
        this.timer.schedule(new RemindTask(), seconds * 10);
        this.timer.schedule(new RemindTaskWithoutBeep(), seconds * 2 * 10);
    }

    class RemindTask extends TimerTask {
        @Override
        public void run() {
            taskList.add("RemindTask at " + this.scheduledExecutionTime());
        }
    }

    class RemindTaskWithoutBeep extends TimerTask {
        @Override
        public void run() {
            taskList.add("RemindTaskWithoutBeep at " + this.scheduledExecutionTime());
            timer.cancel();
        }
    }

    public List<String> getTaskList() {
        return this.taskList;
    }

}
