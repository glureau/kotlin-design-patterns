package glureau.kdp.abstractfactory.java;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: abstract factory pattern");
		AbstractFactory factory1 = new ConcreteFactoryA();
		AbstractProduct product1 = factory1.createProduct();
		product1.feature();

		System.out.println();
		System.out.println("***Demo: adding a new AbstractFactory implementation");
		
		AbstractFactory factory2 = new ConcreteFactoryB();
		AbstractProduct product2 = factory2.createProduct();
		product2.feature();
	}
}
