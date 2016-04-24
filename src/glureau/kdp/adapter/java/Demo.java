package glureau.kdp.adapter.java;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: pattern Adapter with class adaptation");
		System.out.println("Creating: Adaptee");
		Adaptee adaptee = new Adaptee(3.2, 6.7);
		System.out.println();
		System.out.println("Creating: class adapter");
		TargetInterface classAdapter = new ClassAdapter(3.2, 6.7);
		System.out.println("Getting: operands through the Adaptee interface: " + adaptee.getFirstOperand() + " ; " + adaptee.getSecondOperand());
		System.out.println("Getting: operands through the TargetInterface interface: " + classAdapter.getOperands());
		System.out.println("Computing 'sum ; max' through the Adaptee interface: " + adaptee.computeSum() + " ; " + adaptee.max());
		System.out.println("Computing 'sum ; max ; multiply' through the TargetInterface: " + classAdapter.sum() + " ; " + classAdapter.max() + " ; " + classAdapter.multiply());

		System.out.println();
		System.out.println("***Demo: pattern Adapter with object adaptation");
		System.out.println("Creating: object adapter");
		TargetInterface objectAdapter = new ObjectAdapter(adaptee);
		System.out.println("Getting: operands through the Adaptee interface: " + adaptee.getFirstOperand() + " ; " + adaptee.getSecondOperand());
		System.out.println("Getting: operands through the TargetInterface interface: " + objectAdapter.getOperands());
		System.out.println("Computing 'sum ; max' through the Adaptee interface: " + adaptee.computeSum() + " ; " + adaptee.max());
		System.out.println("Computing 'sum ; max ; multiply' through the TargetInterface: " + objectAdapter.sum() + " ; " + objectAdapter.max() + " ; " + objectAdapter.multiply());
	}
}
