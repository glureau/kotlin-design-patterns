package glureau.kdp.adapter.java;

import java.util.Arrays;
import java.util.List;

/**
 * This is the Adapter class: it subclasses the Adaptee and also implements
 * the TargetInterface that is expected by the clients. In this case, adaptation
 * is achieved through inheritance.
 * This is possible only if Adaptee is non-final.
 */
class ClassAdapter extends Adaptee implements TargetInterface {

	ClassAdapter(double operand1, double operand2) {
		super(operand1, operand2);
	}

	@Override
	public List<Double> getOperands(){
		return Arrays.asList(super.getFirstOperand(), super.getSecondOperand());
	}

	@Override
	public double sum() {
		return super.computeSum();
	}

	@Override
	public double multiply() {
		return super.getFirstOperand()*super.getSecondOperand();
	}
	
	//No need to implement the TargetInterface.max() as it is already implemented
	//by the inherited Adaptee.max() method
}
