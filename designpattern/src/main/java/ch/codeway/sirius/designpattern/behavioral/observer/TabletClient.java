package ch.codeway.sirius.designpattern.behavioral.observer;

/**
 * An Observable can be register to subject event
 */
public class TabletClient extends Observer {

    public void addMessage(String message) {
        subject.setState(message + " - sent from tablet");
    }

    @Override
    void update() {
        System.out.println("Tablet Stream: " + subject.getState());
    }

}
