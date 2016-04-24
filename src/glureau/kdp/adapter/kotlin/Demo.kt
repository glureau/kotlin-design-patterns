package glureau.kdp.adapter.kotlin

object Demo {

    @JvmStatic fun main(args: Array<String>) {
        println("***Demo: pattern Adapter with class adaptation")
        println("Creating: Adaptee")
        val adaptee = Adaptee(3.2, 6.7)
        println()
        println("Creating: class adapter")
        val classAdapter = ClassAdapter(3.2, 6.7)
        println("Getting: operands through the Adaptee interface: " + adaptee.firstOperand + " ; " + adaptee.secondOperand)
        println("Getting: operands through the TargetInterface interface: " + classAdapter.operands)
        println("Computing 'sum ; max' through the Adaptee interface: " + adaptee.computeSum() + " ; " + adaptee.max())
        println("Computing 'sum ; max ; multiply' through the TargetInterface: " + classAdapter.sum() + " ; " + classAdapter.max() + " ; " + classAdapter.multiply())

        println()
        println("***Demo: pattern Adapter with object adaptation")
        println("Creating: object adapter")
        val objectAdapter = ObjectAdapter(adaptee)
        println("Getting: operands through the Adaptee interface: " + adaptee.firstOperand + " ; " + adaptee.secondOperand)
        println("Getting: operands through the TargetInterface interface: " + objectAdapter.operands)
        println("Computing 'sum ; max' through the Adaptee interface: " + adaptee.computeSum() + " ; " + adaptee.max())
        println("Computing 'sum ; max ; multiply' through the TargetInterface: " + objectAdapter.sum() + " ; " + objectAdapter.max() + " ; " + objectAdapter.multiply())
    }
}
