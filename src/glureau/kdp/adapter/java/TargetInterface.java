package glureau.kdp.adapter.java;

import java.util.List;

/**
 * This is the interface that the clients expect. Therefore, the Adaptee class
 * must be adapted to this interface in order to be re-used by clients.
 */
interface TargetInterface {
	
	List<Double> getOperands();
	
	double sum();
	
	double max();
	
	/**
	 * This operation is not among Adaptee's ones
	 */
	double multiply();
}
