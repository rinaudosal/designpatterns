package ch.codeway.sirius.designpattern.behavioral.state;

/**
 * Abstract Class that are extended of all ConcreteStates developed
 */
public abstract class State {

	/**
	 * Generic method to request to change Fun State
	 */
	public void handleRequest() {
		throw new UnsupportedOperationException("Shouldn't be able to get here.");
	}
}
