package glureau.kdp.structural.adapter.kotlin

object Demo {

    @JvmStatic fun main(args: Array<String>) {
        println("***Demo: pattern Adapter with class adaptation")
        println("Creating: Adaptee")
        val adaptee = OpenAdaptee(3.2, 6.7)
        println()
        println("Creating: class adapter")
        val openAdapter : TargetInterface= OpenAdapter(3.2, 6.7)
        println("Getting: operands through the Adaptee interface: " + adaptee.firstOperand + " ; " + adaptee.secondOperand)
        println("Getting: operands through the TargetInterface interface: " + openAdapter.operands)
        println("Computing 'sum ; max' through the Adaptee interface: " + adaptee.computeSum() + " ; " + adaptee.max())
        println("Computing 'sum ; max ; multiply' through the TargetInterface: " + openAdapter.sum() + " ; " + openAdapter.max() + " ; " + openAdapter.multiply())

        println()
        println("***Demo: pattern Adapter with object adaptation")
        println("Creating: object adapter")
        val javaAdaptee = JavaAdaptee(3.2, 6.7)
        val javaAdapter : TargetInterface = JavaAdapter(javaAdaptee)
        println("Getting: operands through the Adaptee interface: " + javaAdaptee.firstOperand + " ; " + javaAdaptee.secondOperand)
        println("Getting: operands through the TargetInterface interface: " + javaAdapter.operands)
        println("Computing 'sum ; max' through the Adaptee interface: " + javaAdaptee.computeSum() + " ; " + javaAdaptee.max())
        println("Computing 'sum ; max ; multiply' through the TargetInterface: " + javaAdapter.sum() + " ; " + javaAdapter.max() + " ; " + javaAdapter.multiply())
    }
}
