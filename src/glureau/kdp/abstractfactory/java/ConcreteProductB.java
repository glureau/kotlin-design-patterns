package glureau.kdp.abstractfactory.java;

/**
 * Concrete implementation B of AbstractProduct
 */
class ConcreteProductB implements AbstractProduct {

	@Override
	public void feature() {
		System.out.println("Called: feature of concrete product B");
	}
}