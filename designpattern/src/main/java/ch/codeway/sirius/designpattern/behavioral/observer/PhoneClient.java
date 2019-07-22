package ch.codeway.sirius.designpattern.behavioral.observer;

/**
 * An Observable can be register to subject event
 */
public class PhoneClient extends Observer {
	
	public void addMessage(String message) {
		subject.setState(message + " - sent from phone");
	}
	
	@Override
	void update() {
		System.out.println("Phone Stream: " + subject.getState());
	}
}
