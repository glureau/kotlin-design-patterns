package glureau.kdp.abstractfactory.kotlin

/**
 * Concrete implementation B of AbstractProduct
 */
internal class ConcreteProductB : AbstractProduct {

    override fun feature() {
        println("Called: feature of concrete product B")
    }
}