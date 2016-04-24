package glureau.kdp.structural.adapter.kotlin

/**
 * This is the "legacy" class that must be adapted to the target interface.
 */
internal open class OpenAdaptee(val firstOperand: Double, val secondOperand: Double) {

    fun computeSum(): Double {
        return firstOperand + secondOperand
    }

    fun max(): Double {
        return Math.max(firstOperand, secondOperand)
    }
}
