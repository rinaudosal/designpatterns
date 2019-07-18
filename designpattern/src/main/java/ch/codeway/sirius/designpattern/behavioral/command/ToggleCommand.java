package ch.codeway.sirius.designpattern.behavioral.command;


/**
 * {@link ToggleCommand} command to switch single light to toggle
 */
public class ToggleCommand implements Command {

    private Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }
}
