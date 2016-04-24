package glureau.kdp.abstractfactory;

/**
 * 
 * Concrete implementation of AbstractProductTypeX
 *
 */
public class ConcreteProductX implements AbstractProductX {

	@Override
	public void feature() {
		System.out.println("Called: feature of concrete product X");
	}
}
