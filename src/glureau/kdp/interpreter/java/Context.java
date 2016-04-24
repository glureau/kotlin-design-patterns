package glureau.kdp.interpreter.java;

import java.util.Hashtable;

public class Context {
	
	private Hashtable<String, Boolean> variableExpressions;
	
	public Context() {
		variableExpressions = new Hashtable<String, Boolean>();
	}
	
	public void assign(VariableExpression expression, boolean value) {
		variableExpressions.put(expression.getName(), new Boolean(value));
	}
	
	public boolean lookup(String varName) {
		return variableExpressions.get(varName).booleanValue();
	}
}
