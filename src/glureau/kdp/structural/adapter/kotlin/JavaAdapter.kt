package glureau.kdp.structural.adapter.kotlin


/**
 * Adapt a java class from Kotlin
 */
internal class JavaAdapter(val adaptee: JavaAdaptee) : TargetInterface {
    override val operands: List<Double>
        get() = arrayListOf(adaptee.firstOperand, adaptee.secondOperand)

    override fun sum(): Double {
        return adaptee.computeSum()
    }

    override fun multiply(): Double {
        return adaptee.firstOperand * adaptee.secondOperand
    }

    override fun max(): Double {
        return adaptee.max();
    }
}
