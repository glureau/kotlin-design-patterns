package glureau.kdp.structural.bridge.java;

/**
 * The abstract interface for the abstraction that must be able to vary 
 * independently from the correspondent implementation
 */
abstract class Abstraction {
	
	abstract void greet();
	
	abstract void setImplementor(Implementor implementor);
}
