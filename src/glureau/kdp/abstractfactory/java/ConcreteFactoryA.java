package glureau.kdp.abstractfactory.java;

/**
 * Concrete implementation for AbstractFactory class: this class implements the
 * creational methods for all the products of a specific family
 */
class ConcreteFactoryA implements AbstractFactory {

	@Override
	public AbstractProduct createProduct() {
		System.out.println("Called: implementation of abstract factory;  will return: ConcreteProductA instance");
		return new ConcreteProductA();
	}
}
