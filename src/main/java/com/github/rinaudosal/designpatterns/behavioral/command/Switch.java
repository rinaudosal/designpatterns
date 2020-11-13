package com.github.rinaudosal.designpatterns.behavioral.command;


/**
 * Invoker actor in Command Patter
 */
public class Switch {

    /**
     * Invoke method
     *
     * @param command command to execute
     */
    public void storeAndExecute(Command command) {
        command.execute();
    }
}
