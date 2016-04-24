package glureau.kdp.behavioral.visitor.java;

import java.util.Collection;

public interface Visitor {
	
	void visit(Collection collection);
	
	void visit(ConcreteElementA concreteElementA);
	
	void visit(ConcreteElementB concreteElementB);
	
	void visit(ConcreteElementC concreteElementC);
}
