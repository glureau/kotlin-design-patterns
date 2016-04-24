package glureau.kdp.behavioral.memento.java;

import glureau.kdp.behavioral.memento.java.original.Memento;
import glureau.kdp.behavioral.memento.java.original.Originator;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: Memento pattern using package visibility scope");
		System.out.println("Creating: new Originator with state=original");
		Originator originator = new Originator("original");
		originator.greet();
		System.out.println("Saving: originator's state");
		Memento memento = originator.saveState();
		System.out.println("Modifying: originator's state with state=modified");		
		originator.setState("modified");
		originator.greet();
		System.out.println("Restoring: originator's former state");
		originator.restoreState(memento);
		originator.greet();
	}
}
