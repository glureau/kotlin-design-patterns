package glureau.kdp.bridge.java;

/**
 * Implements the operations stated in Implementor and that will be used by
 * the Abstraction subclasses
 */
class ConcreteImplementor implements Implementor {
	
	private String name;

	ConcreteImplementor(String name) {
		this.name = name;
	}

	@Override
	public void openMouth() {
		// does nothing
	}

	@Override
	public String tellName() {
		return this.name;
	}
}
