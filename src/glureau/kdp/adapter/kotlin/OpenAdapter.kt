package glureau.kdp.adapter.kotlin

/**
 * This is the Adapter class: it subclasses the Adaptee and also implements
 * the TargetInterface that is expected by the clients. In this case, adaptation
 * is achieved through inheritance.
 */
internal class OpenAdapter(operand1: Double, operand2: Double) : OpenAdaptee(operand1, operand2), TargetInterface {

    override val operands: List<Double>
        get() = arrayListOf(super.firstOperand, super.secondOperand)

    override fun sum(): Double {
        return super.computeSum()
    }

    override fun multiply(): Double {
        return super.firstOperand * super.secondOperand
    }

    //No need to implement the TargetInterface.max() as it is already implemented
    //by the inherited Adaptee.max() method
}
