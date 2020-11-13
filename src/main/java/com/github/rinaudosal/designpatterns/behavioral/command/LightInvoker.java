package com.github.rinaudosal.designpatterns.behavioral.command;


/**
 * The Invoker - Invoke the receiver
 */
public class LightInvoker {

    /**
     * Invoke method
     *
     * @param command command to execute
     */
    public void storeAndExecute(LightCommand command) {
        command.execute();
    }
}
