package glureau.kdp.adapter.kotlin

import java.util.Arrays

/**
 * This is the Adapter class: it implements the TargetInterface that is expected
 * by the clients and is composed of an Adaptee object instance. In this case,
 * adaptation is achieved through composition.
 */
internal class ObjectAdapter(private val adaptee: Adaptee) : TargetInterface {

    override val operands: List<Double>
        get() = Arrays.asList(this.adaptee.firstOperand,
                this.adaptee.secondOperand)

    override fun sum(): Double {
        return this.adaptee.computeSum()
    }

    override fun multiply(): Double {
        return this.adaptee.firstOperand * this.adaptee.secondOperand
    }

    override fun max(): Double {
        return this.adaptee.max()
    }
}
