package glureau.kdp.abstractfactory.kotlin

/**
 * Concrete implementation A of AbstractProduct
 */
internal class ConcreteProductA : AbstractProduct {

    override fun feature() {
        println("Called: feature of concrete product A")
    }
}
