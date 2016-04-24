package glureau.kdp.structural.bridge.java;

/**
 * This is a subclass of Abstraction. Please notice that the abstract methods 
 * stated by Abstract are implemented using the base operations provided by
 * the encapsulated Implementor object 
 */
class RefinedAbstraction extends Abstraction {
	
	private Implementor implementor;
	
	RefinedAbstraction() {
		this.implementor = new ConcreteImplementor("Sarah");
	}
	
	RefinedAbstraction(Implementor implementor) {
		this.implementor = implementor;
	}

	void setImplementor(Implementor implementor){
		this.implementor = implementor;
	}

	@Override
	void greet() {
		implementor.openMouth();
		String name = implementor.tellName();
		System.out.println("Hello my name is "+name);
	}
}
