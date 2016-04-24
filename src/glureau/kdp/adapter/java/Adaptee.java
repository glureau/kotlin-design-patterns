package glureau.kdp.adapter.java;

/**
 * This is the "legacy" class that must be adapted to the target interface.
 */
class Adaptee {
	
	private double operand1;
	private double operand2;
	
	Adaptee(double operand1, double operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	double getFirstOperand(){
		return this.operand1;
	}
	
	double getSecondOperand(){
		return this.operand2;
	}
	
	double computeSum(){
		return this.operand1 + this.operand2;
	}

	// Needs to be public or we will have to redefine it in ClassAdapter
	public double max(){
		return Math.max(this.operand1, this.operand2);
	}
}
