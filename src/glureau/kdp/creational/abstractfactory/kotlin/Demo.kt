package glureau.kdp.creational.abstractfactory.kotlin

object Demo {

    @JvmStatic fun main(args: Array<String>) {
        println("***Demo: abstract factory pattern")
        val factory1 = ConcreteFactoryA()
        val product1 = factory1.createProduct()
        product1.feature()

        println()
        println("***Demo: adding a new AbstractFactory implementation")

        val factory2 = ConcreteFactoryB()
        val product2 = factory2.createProduct()
        product2.feature()
    }
}
