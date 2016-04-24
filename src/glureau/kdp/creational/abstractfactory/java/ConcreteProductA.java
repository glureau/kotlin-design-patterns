package glureau.kdp.creational.abstractfactory.java;

/**
 * Concrete implementation A of AbstractProduct
 */
class ConcreteProductA implements AbstractProduct {

	@Override
	public void feature() {
		System.out.println("Called: feature of concrete product A");
	}
}
