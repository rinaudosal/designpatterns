package ch.codeway.sirius.designpattern.behavioral.observer;

/**
 * Observer provide to update state (notification are managed from {@link MessageStream}
 */
public abstract class Observer {
    protected Subject subject;

    void subscribe(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    /**
     * Abstract method to update datas and notify to observers
     */
    abstract void update();
}
