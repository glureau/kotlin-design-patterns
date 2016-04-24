package glureau.kdp.abstractfactory.kotlin

/**
 * Concrete implementation for AbstractFactory class: this class implements the
 * creational methods for all the products of a specific family
 */
internal class ConcreteFactoryB : AbstractFactory {

    override fun createProduct(): AbstractProduct {
        println("Called: implementation of abstract factory; will return: ConcreteProductB instance")
        return ConcreteProductB()
    }
}
