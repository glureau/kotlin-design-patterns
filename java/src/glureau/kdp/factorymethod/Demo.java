package glureau.kdp.factorymethod;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: factory method pattern");
		AbstractCreator factory = new ConcreteCreator();
		AbstractProduct product = factory.factoryMethod();
		product.feature();
	}

}
