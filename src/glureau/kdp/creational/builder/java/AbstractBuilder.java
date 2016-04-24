package glureau.kdp.creational.builder.java;

/**
 * 
 * This is the abstract interface for creating parts of a complex product.
 *
 */
public interface AbstractBuilder {
	
	/**
	 * 
	 * Builds part A of the product
	 */
	void buildPartA();

	/**
	 * 
	 * Builds part B of the product
	 */
	void buildPartB();
	
	/**
	 * 
	 * Returns the complete instance of the product
	 */
	Product getProduct();

}
