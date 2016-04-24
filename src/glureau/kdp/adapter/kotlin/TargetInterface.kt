package glureau.kdp.adapter.kotlin

/**
 * This is the interface that the clients expect. Therefore, the Adaptee class
 * must be adapted to this interface in order to be re-used by clients.
 */
interface TargetInterface {

    val operands: List<Double>

    fun sum(): Double

    fun max(): Double

    /**
     * This operation is not among Adaptee's ones
     */
    fun multiply(): Double
}
