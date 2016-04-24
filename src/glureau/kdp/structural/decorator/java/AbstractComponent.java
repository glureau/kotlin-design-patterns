package glureau.kdp.structural.decorator.java;

/**
 * The abstract interface of the components that will be decorated. This interface
 * is implemented by all Decorator subtypes.
 *
 */
public interface AbstractComponent {
	
	String getName();
	
	int getAge();
}
