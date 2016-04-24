package glureau.kdp.factorymethod;

/**
 * 
 * Implementation of abstract factory class and method. Modify it as you need!
 *
 */

public class ConcreteCreator extends AbstractCreator {

	@Override
	public AbstractProduct factoryMethod() {
		System.out.println("Called: implementation of factory method; "
				+ "will return: ConcreteProduct instance");
		return new ConcreteProduct();
	}
}
