package glureau.kdp.abstractfactory.java;

/**
 * 
 * This is the abstract factory class, grouping together the creational methods
 * for each product in the product family. Note that the created products are
 * returned with their asbtract interfaces. Modify it as needed!
 *
 */
interface AbstractFactory {
	AbstractProduct createProduct();
}
